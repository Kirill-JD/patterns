package Builder;

public class PhoneDeviceBuilder extends DeviceBuilder{
    @Override
    void buildName() {
        device.setName(NameDevice.PHONE);
    }

    @Override
    void buildPrice() {
        device.setPrice(500);
    }
}
