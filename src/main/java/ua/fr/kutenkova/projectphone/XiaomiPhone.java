package ua.fr.kutenkova.projectphone;

public class XiaomiPhone extends Phone implements PhoneConnection {
    public XiaomiPhone(String brandName, String model, int phoneStorage, int phoneRAMVolume) {
        super(brandName, model, phoneStorage, phoneRAMVolume);
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
