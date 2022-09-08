package CreationalPatterns.AbstractFactory.restaurant;

import CreationalPatterns.AbstractFactory.Dish;

public class Pasta implements Dish {
    @Override
    public void createDish() {
        System.out.println("pasta added to order");
    }
}
