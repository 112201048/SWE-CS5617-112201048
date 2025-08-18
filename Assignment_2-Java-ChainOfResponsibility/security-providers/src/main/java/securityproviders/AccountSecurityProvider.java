package securityproviders;

public class AccountSecurityProvider implements ISecurityProvider {
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
        return scanResult;
    }

    @Override
    public String getName() {
        return "Account Security Provider";
    }
}
