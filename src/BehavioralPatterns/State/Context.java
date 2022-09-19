package BehavioralPatterns.State;

public class Context implements State {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void doAction() {
        state.doAction();
    }
}
