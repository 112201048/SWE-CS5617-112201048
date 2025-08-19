package securityproviders;

public class AntivirusSecurityProvider implements ISecurityProvider {
    ISecurityProvider _next;
    public AntivirusSecurityProvider()
    {
        //Constructor Logic if needed
    }

    @Override
    public boolean scan() {
        // Simulate a virus scan
        System.out.println("Scanning for viruses...");
        boolean scanResult = true; // Assume the scan is successful
        if (!scanResult){
            System.out.println("Antivirus: Scan Failed");
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
        return "Antivirus Security Provider";
    }
}
