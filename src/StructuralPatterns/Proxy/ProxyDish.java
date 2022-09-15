package StructuralPatterns.Proxy;

public class ProxyDish implements Dish{
    private int quantity;
    private Dish dish;

    public ProxyDish(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void startCooking() {
        if (dish == null) {
            dish = new Pasta(quantity);
        }
        dish.startCooking();
    }
}
