package BehavioralPatterns.State;

public class Stop implements State{
    @Override
    public void doAction() {
        System.out.println("Stop");
    }
}
