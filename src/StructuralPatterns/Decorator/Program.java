package StructuralPatterns.Decorator;

public class Program {
    public static void main(String[] args) {
        Phone phone = new Smartphone(new MobilePhone(new Telephone()));

        System.out.println(phone.call());
    }
}
