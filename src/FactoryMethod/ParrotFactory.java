package FactoryMethod;

public class ParrotFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Parrot();
    }
}
