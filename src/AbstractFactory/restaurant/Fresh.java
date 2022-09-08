package AbstractFactory.restaurant;

import AbstractFactory.Drink;

public class Fresh implements Drink {
    @Override
    public void createDrink() {
        System.out.println("fresh added to order");
    }
}
