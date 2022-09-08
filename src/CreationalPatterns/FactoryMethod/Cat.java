package CreationalPatterns.FactoryMethod;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("the cat eats");
    }
}
