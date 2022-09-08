package AbstractFactory.fastFood;

import AbstractFactory.Dessert;

public class IceCream implements Dessert {
    @Override
    public void createDessert() {
        System.out.println("ice cream added to order");
    }
}
