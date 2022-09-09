package StructuralPatterns.Adapter;

public class AdapterDatabase extends DatabaseApplication implements Database{
    @Override
    public void insert() {
        insertObject();
    }

    @Override
    public void select() {
        selectObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }
}
