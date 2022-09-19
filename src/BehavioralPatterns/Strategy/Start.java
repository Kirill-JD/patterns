package BehavioralPatterns.Strategy;

public class Start implements State {
    @Override
    public void doAction() {
        System.out.println("Start");
    }
}
