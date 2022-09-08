package AbstractFactory.restaurant;

import AbstractFactory.ComboFactory;
import AbstractFactory.Dessert;
import AbstractFactory.Dish;
import AbstractFactory.Drink;

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
