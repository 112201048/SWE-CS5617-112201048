using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace Protocols
{
    public class TcpCommunicator: ProtocolCommunicatorBase, ICommunicator 
    {
        public bool SendMessage(string message, string ip)
        {
            OpenSocket();
            SetProtocol();
            Console.WriteLine($"message: '{message}', sent to dest ip: {ip} using protocol: {Protocol}");
            CloseSocket();
            return true;
        }
        public string GetName()
        {
            return "Tcp Communicator";
        }
        public override void SetProtocol()
        {
            Protocol = "TCP";
        }
    }
}