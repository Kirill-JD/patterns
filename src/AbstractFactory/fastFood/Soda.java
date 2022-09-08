package AbstractFactory.fastFood;

import AbstractFactory.Drink;

public class Soda implements Drink {
    @Override
    public void createDrink() {
        System.out.println("soda added to order");
    }
}
