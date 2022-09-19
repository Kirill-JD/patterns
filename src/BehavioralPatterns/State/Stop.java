package BehavioralPatterns.State;

public class Stop implements State{
    @Override
    public void doAction() {
        System.out.println("Stop");
    }

    @Override
    public void next(Context context) {
        context.setState(new Start());
    }
}
