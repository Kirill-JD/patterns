package StructuralPatterns.Facade;

public class Tea implements Dish {
    @Override
    public void createDish() {
        System.out.println("tea added to order");
    }
}
