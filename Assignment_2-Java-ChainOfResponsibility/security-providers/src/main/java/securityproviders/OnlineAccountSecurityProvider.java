package securityproviders;

public class OnlineAccountSecurityProvider extends AccountSecurityProvider implements ISecurityProvider {
    ISecurityProvider _next;
    public OnlineAccountSecurityProvider()
    {
        //Constructor Logic if needed
    }

    @Override
    public boolean scan() {
        // Note: Online account security scans may also involve checking local account security.

        // Simulate an online account security scan
        System.out.println("Scanning online account security...");
        boolean scanResult = true; // Assume the scan is successful

        if (!scanResult){
            System.out.println("Online Account Security: Scan Failed");
        }
        else{
            System.out.println(getName() + ": Scan Complete");
        }
        // Call the base class scan method.
        boolean baseScanResult = super.scan();
        scanResult = scanResult && baseScanResult;
        // Continue only if the current scan passed
        if (_next != null && scanResult){
            scanResult = _next.scan();
        }
        return scanResult; // Combine results
    }

    @Override
    public ISecurityProvider setNext(ISecurityProvider next)
    {
        _next = next;
        return next;
    }

    @Override
    public String getName() {
        return "Online Account Security Provider";
    }
}
