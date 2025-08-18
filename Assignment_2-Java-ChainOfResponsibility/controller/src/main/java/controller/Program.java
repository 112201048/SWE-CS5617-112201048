package controller;

import java.util.ArrayList;
import java.util.List;
import securityproviders.*;

public class Program {
    public static void main(String[] args) {
        // Create the various security provider instances.
        ISecurityProvider chain = new EncoderSecurity(new OnlineAccountSecurityProvider
                (new AntivirusSecurityProvider(new DeviceSecurity(null))));
        // Start the scans
        if (chain.scan()){
            System.out.println("All the scans have completed Successfully");
        }
        else{
            System.out.println("Scans Failed due to one or more Failures");
        }
    }
}
