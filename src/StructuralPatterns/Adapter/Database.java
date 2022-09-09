package StructuralPatterns.Adapter;

public interface Database {
    void insert();
    void select();
    void update();
    void delete();
}
