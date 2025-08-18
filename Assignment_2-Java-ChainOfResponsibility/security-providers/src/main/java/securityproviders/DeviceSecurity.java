package securityproviders;

public class DeviceSecurity implements ISecurityProvider {
    ISecurityProvider _next;
    public DeviceSecurity(ISecurityProvider next) {
        _next = next;
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
            scanResult = scanResult && _next.scan();
        }
        return scanResult;
    }

    @Override
    public String getName() {
        return "Device Security Provider";
    }
}
