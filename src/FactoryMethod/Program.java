package FactoryMethod;

public class Program {
    public static void main(String[] args) {
        AnimalFactory animalFactory = createAnimalBySpecies("dog");
        Animal animal = animalFactory.createAnimal();
        animal.eat();
    }

    public static AnimalFactory createAnimalBySpecies(String type) {
        return switch (type) {
            case "cat" -> new CatFactory();
            case "dog" -> new DogFactory();
            case "parrot" -> new ParrotFactory();
            default -> throw new RuntimeException();
        };
    }
}
