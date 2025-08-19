package securityproviders;

public class AccountSecurityProvider implements ISecurityProvider {
    ISecurityProvider _next;
    public AccountSecurityProvider() {
        //Constructor Logic if needed
    }

    @Override
    public boolean scan() {
        // Simulate an account security scan
        System.out.println("Scanning account security...");
        boolean scanResult = true; // Assume the scan is successful
        if (!scanResult){
            System.out.println("Account Security : Scan Failed");
        }
        else{
            System.out.println("Account Security Provider : Scan Complete");
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
        return "Account Security Provider";
    }
}
