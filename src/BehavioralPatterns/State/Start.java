package BehavioralPatterns.State;

public class Start implements State{
    @Override
    public void doAction() {
        System.out.println("Start");
    }

    @Override
    public void next(Context context) {
        context.setState(new Stop());
    }
}
