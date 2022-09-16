package BehavioralPatterns.Iterator;

public class Menu implements Collection {
    String[] dish;

    public Menu(String[] dish) {
        this.dish = dish;
    }

    public String[] getDish() {
        return dish;
    }

    public void setDish(String[] dish) {
        this.dish = dish;
    }

    @Override
    public Iterator getIterator() {
        return new DishIterator();
    }

    public class DishIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < dish.length;
        }

        @Override
        public Object next() {
            return dish[index++];
        }
    }
}
