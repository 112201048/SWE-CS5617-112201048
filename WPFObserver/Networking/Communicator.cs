
namespace Networking
{
    public class Communicator : ICommunicator
    {
        FileSystemWatcher _watcher;
        Dictionary<string, IMessageListener> map = new();

        public Communicator()
        {
            _watcher = new FileSystemWatcher();
            _watcher.Path = ".\\";
            _watcher.Filter = "in.txt";
            _watcher.NotifyFilter = NotifyFilters.LastWrite;
            _watcher.EnableRaisingEvents = true;
            _watcher.Changed += OnChanged;
        }

        private void OnChanged(object sender, FileSystemEventArgs e)
        {
            string message = File.ReadAllText(e.FullPath);
            string[] slicedMessage = message.Split(':');
            if (map.Count > 0 && map.ContainsKey(slicedMessage[0]))
            {
                map[slicedMessage[0]].OnMessageReceived(slicedMessage[1]);
            }
        }


        public void SendMessage(string message, string ip)
        {
            File.WriteAllText(".\\out.txt", message);
        }

        public void Subscribe(string id, IMessageListener listener)
        {
            map.Add(id, listener);
        }
    }
}
