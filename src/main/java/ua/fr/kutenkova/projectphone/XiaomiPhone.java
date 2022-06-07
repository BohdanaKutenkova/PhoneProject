package ua.fr.kutenkova.projectphone;

public class XiaomiPhone extends Phone implements PhoneConnection {
    public XiaomiPhone(String br, String m, int st, int v) {
        super(br, m, st, v);
    }

    @Override
    public void makeRing() {
        System.out.println("Xiaomi makes ring");
    }

    @Override
    public void sendMessage() {
        System.out.println("Xiaomi sends message");
    }
}
