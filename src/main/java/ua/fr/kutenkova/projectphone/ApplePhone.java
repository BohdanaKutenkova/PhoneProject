package ua.fr.kutenkova.projectphone;

public class ApplePhone extends Phone implements PhoneConnection {
    public ApplePhone(String brandName, String model, int phoneStorage, int phoneRAMVolume) {
        super(brandName, model, phoneStorage, phoneRAMVolume);
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

