package CreationalPatterns.AbstractFactory.fastFood;

import CreationalPatterns.AbstractFactory.Drink;

public class Soda implements Drink {
    @Override
    public void createDrink() {
        System.out.println("soda added to order");
    }
}
