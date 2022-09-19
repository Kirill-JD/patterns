package BehavioralPatterns.State;

public class Program {
    public static void main(String[] args) {
        State stateStart = new Start();
        State stopStop = new Stop();
        Context context = new Context();

        context.setState(stateStart);
        context.doAction();
        context.setState(stopStop);
        context.doAction();
    }
}
