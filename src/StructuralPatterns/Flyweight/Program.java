package StructuralPatterns.Flyweight;

public class Program {
    public static void main(String[] args) {
        Order order = new Order();
        DishFactory dishFactory = new DishFactory();

        order.addDish(dishFactory.getDish("pasta"));
        order.addDish(dishFactory.getDish("pasta"));
        order.addDish(dishFactory.getDish("pasta"));
        order.addDish(dishFactory.getDish("profiteroles"));
        order.addDish(dishFactory.getDish("profiteroles"));

        order.prepareAnOrder();
    }
}
