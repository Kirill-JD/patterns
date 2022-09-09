package StructuralPatterns.Bridge;

public abstract class Place {
    protected Device device;

    public Place(Device device) {
        this.device = device;
    }

    public abstract void deviceAvailability();
}
