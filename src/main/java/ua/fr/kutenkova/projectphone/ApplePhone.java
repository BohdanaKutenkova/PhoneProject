package ua.fr.kutenkova.projectphone;

public class ApplePhone extends Phone implements PhoneConnection {
    public ApplePhone(String br, String m, int st, int v) {
        super(br, m, st, v);
    }

    @Override
    public void makeRing() {
        System.out.println("Apple makes ring");
    }

    @Override
    public void sendMessage() {
        System.out.println("Apple sends message");
    }
}

