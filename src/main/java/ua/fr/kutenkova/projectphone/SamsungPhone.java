package ua.fr.kutenkova.projectphone;

public class SamsungPhone extends Phone implements PhoneConnection, PhoneMedia {
    public SamsungPhone(String brandName, String model, int phoneStorage, int phoneRAMVolume) {
        super(brandName, model, phoneStorage, phoneRAMVolume);
    }

    @Override
    public void makeRing() {
        System.out.println("Samsung makes ring");
    }

    @Override
    public void sendMessage() {
        System.out.println("Samsung sends message");
    }

    @Override
    public void makePhoto() {
        System.out.println("Samsung makes photo");
    }

    @Override
    public void makeVideo() {
        System.out.println("Samsung makes video");
    }
}
