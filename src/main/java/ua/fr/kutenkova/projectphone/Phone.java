package ua.fr.kutenkova.projectphone;

public abstract class Phone {
    public String brandName;
    public String model;
    public int phoneStorage;
    public int phoneRAMVolume;

public Phone(String br, String m, int st, int v) {
    this.brandName = br;
    this.model = m;
    this.phoneStorage = st;
    this.phoneRAMVolume = v;
}

@Override
public String toString() {
    return String.format("Brand name - " + brandName
            + ", model - " + model
            + ", phone storage capacity - " + phoneStorage
            + ", phone RAM volume - " + phoneRAMVolume);
}
    }



