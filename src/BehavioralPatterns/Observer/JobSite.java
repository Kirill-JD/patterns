package BehavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class JobSite implements Observed{
    private List<String> vacancies = new ArrayList<>();
    private List<Observer> users = new ArrayList<>();

    public void addVacancy(String vacancy) {
        vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        users.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        users.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : users) {
            observer.handleEvent(vacancies);
        }
    }
}
