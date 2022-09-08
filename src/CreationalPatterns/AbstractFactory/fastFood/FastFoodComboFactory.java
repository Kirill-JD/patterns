package CreationalPatterns.AbstractFactory.fastFood;

import CreationalPatterns.AbstractFactory.ComboFactory;
import CreationalPatterns.AbstractFactory.Dessert;
import CreationalPatterns.AbstractFactory.Dish;
import CreationalPatterns.AbstractFactory.Drink;

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
