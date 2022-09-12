package StructuralPatterns.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class DishFactory {
    private static final Map<String, Dish> dishMap = new HashMap<>();

    public Dish getDish(String name) {
        Dish dish = dishMap.get(name);
        if (dish == null) {
            switch (name) {
                case "pasta" -> {
                    dish = new Pasta();
                    System.out.println("new Pasta");
                }
                case "profiteroles" -> {
                    dish = new Profiteroles();
                    System.out.println("new Profiteroles");
                }
                default -> throw new RuntimeException();
            }
            dishMap.put(name, dish);
        }
        return dish;
    }
}
