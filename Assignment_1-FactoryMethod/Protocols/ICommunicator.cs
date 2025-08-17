namespace Protocols
{
    public interface ICommunicator
    {
        bool SendMessage(string message, string ip);
        string GetName();
    }
}
