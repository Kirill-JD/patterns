package Builder;

public class Director {
    DeviceBuilder builder;

    public void setBuilder(DeviceBuilder builder) {
        this.builder = builder;
    }

    Device buildDevice() {
        builder.createDevice();
        builder.buildName();
        builder.buildPrice();

        return builder.getDevice();
    }
}
