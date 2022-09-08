package CreationalPatterns.AbstractFactory.restaurant;

import CreationalPatterns.AbstractFactory.Drink;

public class Fresh implements Drink {
    @Override
    public void createDrink() {
        System.out.println("fresh added to order");
    }
}
