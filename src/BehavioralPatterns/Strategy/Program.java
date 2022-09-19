package BehavioralPatterns.Strategy;

public class Program {
    public static void main(String[] args) {
        State stateStart = new Start();
        State stopStop = new Stop();
        Context context = new Context();

        context.setState(stateStart);
        context.execute();
        context.setState(stopStop);
        context.execute();
    }
}
