package AbstractFactory.fastFood;

import AbstractFactory.Dish;

public class Cheeseburger implements Dish {
    @Override
    public void createDish() {
        System.out.println("cheeseburger added to order");
    }
}
