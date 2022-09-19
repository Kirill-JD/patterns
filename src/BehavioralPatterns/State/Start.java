package BehavioralPatterns.State;

public class Start implements State{
    @Override
    public void doAction() {
        System.out.println("Start");
    }
}
