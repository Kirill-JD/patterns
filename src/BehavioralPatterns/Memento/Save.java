package BehavioralPatterns.Memento;

public class Save {
    private final String name;
    private final int age;

    public Save(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
