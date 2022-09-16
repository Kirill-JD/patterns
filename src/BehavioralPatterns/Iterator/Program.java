package BehavioralPatterns.Iterator;

public class Program {
    public static void main(String[] args) {
        String[] dishes = {"pasta", "profiteroles", "burger"};
        Menu menu = new Menu(dishes);

        Iterator iterator = menu.getIterator();

        System.out.println("Menu:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
