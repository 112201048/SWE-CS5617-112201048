using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Networking
{
    public class Listener : IMessageListener
    {
        public void OnMessageReceived(string message)
        {
            Console.WriteLine($"Message Received in the Networing Module: {message}");

        }
    }
}
