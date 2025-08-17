using Protocols;

namespace Network
{
    internal class Controller
    {
        static void Main(string[] args)
        {
            // Create the various protocol communicator instances.
            //ICommunicator TcpCommunicator = new TcpCommunicator();
            //ICommunicator UdpCommunicator = new UdpCommunicator();
            //ICommunicator RpcCommunicator = new RemoteProcedureCallCommunicator();

            // Sending a message using each of the communicators
            //TcpCommunicator.SendMessage("Hey", "192.168.0.1");
            //UdpCommunicator.SendMessage("Hey", "192.168.0.2");
            //RpcCommunicator.SendMessage("Hey", "192.168.0.3");
            CommunicatorFactory factory = new();
            bool reliabilityRequired = false;
            ICommunicator comm = factory.GetCommunicator(reliabilityRequired);
            comm.SendMessage("Hey", "192.168.0.1");
        }
    }
}
