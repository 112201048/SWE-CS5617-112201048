package securityproviders;

public class EncoderSecurity implements ISecurityProvider{
    ISecurityProvider _next = null;
    public EncoderSecurity(ISecurityProvider next){
        _next = next;
    }

    public ISecurityProvider GetNext(){
        return _next;
    }

    @Override
    public boolean scan() {
        boolean result = true;
        System.out.println("Starting set of Scans");
        result = result && _next.scan();
        return result;
    }

    @Override
    public String getName() {
        return "ENCODER";
    }
}
