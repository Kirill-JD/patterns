package CreationalPatterns.AbstractFactory.fastFood;

import CreationalPatterns.AbstractFactory.Dish;

public class Cheeseburger implements Dish {
    @Override
    public void createDish() {
        System.out.println("cheeseburger added to order");
    }
}
