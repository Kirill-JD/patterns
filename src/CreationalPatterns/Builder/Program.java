package CreationalPatterns.Builder;

public class Program {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(getDeviceBuilderByName("phone"));
        Device device = director.buildDevice();

        System.out.println(device);
    }

    public static DeviceBuilder getDeviceBuilderByName(String name) {
        return switch (name) {
            case "phone" -> new PhoneDeviceBuilder();
            case "pc" -> new PcDeviceBuilder();
            default -> throw new RuntimeException();
        };
    }
}
