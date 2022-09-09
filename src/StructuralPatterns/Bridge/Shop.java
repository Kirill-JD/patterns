package StructuralPatterns.Bridge;

public class Shop extends Place {

    public Shop(Device device) {
        super(device);
    }

    @Override
    public void deviceAvailability() {
        System.out.println("the product is in stock in the store");
        device.getAvailability();
    }
}
