package StructuralPatterns.Facade;

public class Profiteroles implements Dish {
    @Override
    public void createDish() {
        System.out.println("profiteroles added to order");
    }
}
