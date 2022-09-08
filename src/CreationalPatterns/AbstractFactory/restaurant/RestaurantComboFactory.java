package CreationalPatterns.AbstractFactory.restaurant;

import CreationalPatterns.AbstractFactory.ComboFactory;
import CreationalPatterns.AbstractFactory.Dessert;
import CreationalPatterns.AbstractFactory.Dish;
import CreationalPatterns.AbstractFactory.Drink;

public class RestaurantComboFactory implements ComboFactory {
    @Override
    public Dish getDish() {
        return new Pasta();
    }

    @Override
    public Drink getDrink() {
        return new Fresh();
    }

    @Override
    public Dessert getDessert() {
        return new Profiteroles();
    }
}
