package CreationalPatterns.Builder;

public class PcDeviceBuilder extends DeviceBuilder{
    @Override
    void buildName() {
        device.setName(NameDevice.PC);
    }

    @Override
    void buildPrice() {
        device.setPrice(1000);
    }
}
