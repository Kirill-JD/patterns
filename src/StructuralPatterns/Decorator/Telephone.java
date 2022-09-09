package StructuralPatterns.Decorator;

public class Telephone implements Phone{
    @Override
    public String call() {
        return "Call";
    }
}
