package StructuralPatterns.Bridge;

public class PcDevice implements Device{
    @Override
    public void getAvailability() {
        System.out.println("PC in stock");
    }
}
