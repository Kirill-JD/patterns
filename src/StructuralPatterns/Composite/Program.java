package StructuralPatterns.Composite;

public class Program {
    public static void main(String[] args) {
        Order order = new Order();

        order.addDish(new Pasta());
        order.addDish(new Pasta());
        order.addDish(new Profiteroles());

        order.prepareAnOrder();
    }
}
