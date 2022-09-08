package Prototype;

public class Program {
    public static void main(String[] args) {
        Project prototype = new Project(1, "first name", "project value...");
        Project clone = prototype.copy();

        System.out.println(prototype);
        System.out.println(clone);
    }
}
