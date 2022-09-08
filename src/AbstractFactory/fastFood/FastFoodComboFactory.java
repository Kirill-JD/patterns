package AbstractFactory.fastFood;

import AbstractFactory.ComboFactory;
import AbstractFactory.Dessert;
import AbstractFactory.Dish;
import AbstractFactory.Drink;

public class FastFoodComboFactory implements ComboFactory {
    @Override
    public Dish getDish() {
        return new Cheeseburger();
    }

    @Override
    public Drink getDrink() {
        return new Soda();
    }

    @Override
    public Dessert getDessert() {
        return new IceCream();
    }
}
