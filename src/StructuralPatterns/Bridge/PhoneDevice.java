package StructuralPatterns.Bridge;

public class PhoneDevice implements Device {
    @Override
    public void getAvailability() {
        System.out.println("Phone in stock");
    }
}
