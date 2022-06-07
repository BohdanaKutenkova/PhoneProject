package ua.fr.kutenkova.projectphone;

public abstract class Phone {
    public String brandName;
    public String model;
    public int phoneStorage;
    public int phoneRAMVolume;

    public Phone(String brandName, String model, int phoneStorage, int phoneRAMVolume) {
        this.brandName = brandName;
        this.model = model;
        this.phoneStorage = phoneStorage;
        this.phoneRAMVolume = phoneRAMVolume;
    }

    @Override
    public String toString() {
        return String.format("Brand name - " + brandName
                + ", model - " + model
                + ", phone storage capacity - " + phoneStorage
                + ", phone RAM volume - " + phoneRAMVolume);
    }
}



