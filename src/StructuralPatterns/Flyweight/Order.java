package StructuralPatterns.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Dish> dishes = new ArrayList<>();

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void prepareAnOrder() {
        for (Dish dish : dishes) {
            dish.createDish();
        }
        System.out.println("the order began to be prepared");
    }
}
