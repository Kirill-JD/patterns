package StructuralPatterns.Decorator;

public class PhoneDecorator implements Phone {
    Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String call() {
        return phone.call();
    }
}
