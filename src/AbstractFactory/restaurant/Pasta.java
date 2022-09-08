package AbstractFactory.restaurant;

import AbstractFactory.Dish;

public class Pasta implements Dish {
    @Override
    public void createDish() {
        System.out.println("pasta added to order");
    }
}
