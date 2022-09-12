package StructuralPatterns.Facade;

import java.util.Arrays;
import java.util.List;

public class OrderCombo {
    private final Pasta pasta = new Pasta();
    private final Profiteroles profiteroles = new Profiteroles();
    private final Tea tea = new Tea();

    private final List<Dish> dishes = Arrays.asList(pasta, profiteroles, tea);

    public void prepareAnOrder() {
        for (Dish dish : dishes) {
            dish.createDish();
        }
        System.out.println("the order began to be prepared");
    }
}
