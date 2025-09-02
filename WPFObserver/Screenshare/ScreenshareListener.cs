using Networking;

namespace Screenshare
{
    public class ScreenshareListener : IMessageListener
    {
        public void OnMessageReceived(string message)
        {
            Console.WriteLine($"Message Received in the Screenshare Module: {message}");
        }
    }
}

