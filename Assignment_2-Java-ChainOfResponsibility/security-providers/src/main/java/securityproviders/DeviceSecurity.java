package securityproviders;

public class DeviceSecurity implements ISecurityProvider {
    ISecurityProvider _next;
    public DeviceSecurity()
    {
        //Constructor Logic if needed
    }

    @Override
    public boolean scan() {
        // Simulate a device security scan
        System.out.println("Scanning device security...");
        boolean scanResult = true; // Assume the scan is successful
        if (!scanResult){
            System.out.println("Device Security: Scan Failed");
        }
        else{
            System.out.println(getName() + ": Scan Complete");
        }
        // Continue only if the current scan passed
        if (_next != null && scanResult){
            scanResult = _next.scan();
        }
        return scanResult;
    }

    @Override
    public ISecurityProvider setNext(ISecurityProvider next)
    {
        _next = next;
        return next;
    }

    @Override
    public String getName() {
        return "Device Security Provider";
    }
}
