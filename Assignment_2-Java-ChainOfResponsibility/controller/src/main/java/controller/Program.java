package controller;

import java.util.ArrayList;
import java.util.List;
import securityproviders.*;

public class Program {
    public static void main(String[] args) {
        // Create the various security provider instances.
        ISecurityProvider device = new DeviceSecurity();
        ISecurityProvider online = new OnlineAccountSecurityProvider();
        ISecurityProvider antivirus = new AntivirusSecurityProvider();
        ISecurityProvider encoder = new EncoderSecurity(device);

        device.setNext(online).setNext(antivirus);
        // Start the scans
        if (encoder.scan()){
            System.out.println("All the scans have completed Successfully");
        }
        else{
            System.out.println("Scans Failed due to one or more Failures");
        }
    }
}
