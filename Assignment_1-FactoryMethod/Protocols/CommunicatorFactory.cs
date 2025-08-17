using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Protocols
{
    public class CommunicatorFactory
    {
        public ICommunicator GetCommunicator(bool reliableRequired)
        {
            if (reliableRequired)
            {
                return new TcpCommunicator();
            }
            else
            {
                return new UdpCommunicator();
            }
        }
    }
}
