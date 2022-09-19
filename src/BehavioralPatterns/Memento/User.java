package BehavioralPatterns.Memento;

public class User {
    private String name;
    private int age;

    public void setNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Save save() {
        return new Save(name, age);
    }

    public void getUser(Save save) {
        name = save.getName();
        age = save.getAge();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
