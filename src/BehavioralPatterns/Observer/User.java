package BehavioralPatterns.Observer;

import java.util.List;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println(name + "\n vacancies: " + vacancies + "\n");
    }
}
