package StructuralPatterns.Decorator;

public class Smartphone extends PhoneDecorator {

    public Smartphone(Phone phone) {
        super(phone);
    }

    public String internet() {
        return "Internet";
    }

    @Override
    public String call() {
        return super.call() + ", " + internet();
    }
}
