package AbstractFactory.restaurant;

import AbstractFactory.Dessert;

public class Profiteroles implements Dessert {
    @Override
    public void createDessert() {
        System.out.println("profiteroles added to order");
    }
}
