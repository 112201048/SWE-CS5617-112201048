using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Protocols
{
    public class RemoteProcedureCallCommunicator: ICommunicator
    {
        string protocol = "";
        public bool SendMessage(string message, string ip)
        {
            SetProtocol();
            Console.WriteLine($"message: '{message}', sent to dest ip: {ip} using protocol {protocol}");
            return true;
        }
        void SetProtocol()
        {
            protocol = "RPC";
        }
        public string GetName()
        {
            return "RPC Communicator";
        }
    }
}
