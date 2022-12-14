package BehavioralPatterns.State;

public class Context {
    private State state = new Start();

    public void setState(State state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void execute() {
        state.doAction();
    }
}
