package ua.fr.kutenkova;

import ua.fr.kutenkova.projectphone.ApplePhone;
import ua.fr.kutenkova.projectphone.NokiaPhone;
import ua.fr.kutenkova.projectphone.SamsungPhone;
import ua.fr.kutenkova.projectphone.XiaomiPhone;

public class Main {
    public static void main(String[] args) {
        SamsungPhone samsung = new SamsungPhone("Samsung", "Ergo 24", 32, 32);
        NokiaPhone nokia = new NokiaPhone("Nokia", "PL-4", 16, 16);
        ApplePhone apple = new ApplePhone("Apple", "13 pro", 128, 128);
        XiaomiPhone xiaomi = new XiaomiPhone("Xiaomi", "Note 10T", 128, 64);

        samsung.makePhoto();
        samsung.sendMessage();
        samsung.makeRing();
        samsung.makeVideo();

        nokia.makePhoto();
        nokia.makeRing();
        nokia.sendMessage();
        nokia.makeVideo();

        apple.makeRing();
        apple.sendMessage();

        xiaomi.makeRing();
        xiaomi.sendMessage();

        System.out.println();
    }
}
