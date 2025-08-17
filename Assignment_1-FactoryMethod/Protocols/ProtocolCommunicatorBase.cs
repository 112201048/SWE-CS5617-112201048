using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Protocols
{
    public abstract class ProtocolCommunicatorBase
    {
        protected string Protocol = "";
        public void OpenSocket()
        {
            Console.WriteLine("Opening Socket...");
        }
        public void CloseSocket()
        {
            Console.WriteLine("Closing Socket...");
        }
        public abstract void SetProtocol();
    }
}
