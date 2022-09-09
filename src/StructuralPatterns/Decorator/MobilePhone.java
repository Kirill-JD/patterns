package StructuralPatterns.Decorator;

public class MobilePhone extends PhoneDecorator {

    public MobilePhone(Phone phone) {
        super(phone);
    }

    public String message() {
        return "Message";
    }

    @Override
    public String call() {
        return super.call() + ", " + message();
    }
}
