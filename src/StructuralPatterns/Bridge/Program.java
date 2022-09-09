package StructuralPatterns.Bridge;

public class Program {
    public static void main(String[] args) {
        Place [] places = {new Shop(new PhoneDevice()), new Warehouse(new PcDevice())};

        for (Place place : places) {
            place.deviceAvailability();
        }
    }
}
