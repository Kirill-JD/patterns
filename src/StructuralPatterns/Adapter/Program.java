package StructuralPatterns.Adapter;

public class Program {
    public static void main(String[] args) {
        Database database = new AdapterDatabase();

        database.insert();
        database.select();
        database.update();
        database.delete();
    }

}
