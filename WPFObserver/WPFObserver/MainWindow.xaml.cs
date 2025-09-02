using Chat;
using Networking;
using Screenshare;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.Windows.Threading;

namespace WPFObserver
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window, IMessageListener
    {
        ICommunicator communicator = new Communicator();
        /// <summary>
        /// Gets the main thread dispatcher in the real mode.
        /// For unit test mode, it gets the current thread's dispatcher.
        /// </summary>
        private static Dispatcher Dispatcher => Application.Current?.Dispatcher ?? Dispatcher.CurrentDispatcher;
        public MainWindow()
        {
            InitializeComponent();
            IMessageListener NwListener = new Listener();
            IMessageListener chatListener = new ChatListener();
            IMessageListener screenshareListener = new ScreenshareListener();

            communicator.Subscribe("NW", NwListener);
            communicator.Subscribe("CHAT", chatListener);
            communicator.Subscribe("SCREEN", screenshareListener);
            communicator.Subscribe("GUI", this);
        }

        public void OnMessageReceived(string message)
        {
            Console.WriteLine($"Message Received in the GUI Module: {message}");
            //msgReceived.Text = message;
            Dispatcher.Invoke(() =>
            {
                msgReceived.Text = message;
            });
        }

        private void OnClick( object sender, RoutedEventArgs e)
        {
            string listenerId = ID.Text;
            string msg = message.Text;
            string completeMessage = listenerId + ":" + msg + '\n';
            communicator.SendMessage(completeMessage, "168.128.0.1");
            MessageBox.Show("Message sent successfully");
        }


    }
}