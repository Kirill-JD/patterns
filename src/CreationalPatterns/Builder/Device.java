package CreationalPatterns.Builder;

public class Device {
    private NameDevice name;
    private int price;

    public void setName(NameDevice name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name=" + name +
                ", price=" + price +
                '}';
    }
}
