package StructuralPatterns.Bridge;

public class Warehouse extends Place {

    public Warehouse(Device device) {
        super(device);
    }

    @Override
    public void deviceAvailability() {
        System.out.println("the product is in stock");
        device.getAvailability();
    }
}
