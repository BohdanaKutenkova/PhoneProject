package ua.fr.kutenkova.projectphone;

public class NokiaPhone extends Phone implements PhoneConnection, PhoneMedia {
    public NokiaPhone(String brandName, String model, int phoneStorage, int phoneRAMVolume) {
        super(brandName, model, phoneStorage, phoneRAMVolume);
    }

    @Override
    public void makeRing() {
        System.out.println("Nokia makes ring");
    }

    @Override
    public void sendMessage() {
        System.out.println("Nokia sends message");
    }

    @Override
    public void makePhoto() {
        System.out.println("Nokia makes photo");
    }

    @Override
    public void makeVideo() {
        System.out.println("Nokia makes video");
    }
}
