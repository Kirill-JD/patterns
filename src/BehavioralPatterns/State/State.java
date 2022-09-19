package BehavioralPatterns.State;

public interface State {
    void doAction();
    void next(Context context);
}
