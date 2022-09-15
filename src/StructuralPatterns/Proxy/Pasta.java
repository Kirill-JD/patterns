package StructuralPatterns.Proxy;

public class Pasta implements Dish {
    private final int quantity;

    public Pasta(int quantity) {
        this.quantity = quantity;
        createDish();
    }

    @Override
    public void startCooking() {
        System.out.println("the order began to be prepared");
    }
    public void createDish() {
        System.out.println(quantity + " pasta added to order");
    }
}
