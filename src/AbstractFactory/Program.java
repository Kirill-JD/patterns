package AbstractFactory;

import AbstractFactory.fastFood.FastFoodComboFactory;
import AbstractFactory.restaurant.RestaurantComboFactory;

public class Program {
    public static void main(String[] args) {
        ComboFactory comboFactory = comboFactoryByEstablishment("restaurant");

        Dish dish = comboFactory.getDish();
        Drink drink = comboFactory.getDrink();
        Dessert dessert = comboFactory.getDessert();

        dish.createDish();
        drink.createDrink();
        dessert.createDessert();
    }

    public static ComboFactory comboFactoryByEstablishment(String establishment) {
        return switch (establishment) {
            case "fast food" -> new FastFoodComboFactory();
            case "restaurant" -> new RestaurantComboFactory();
            default -> throw new RuntimeException();
        };
    }
}
