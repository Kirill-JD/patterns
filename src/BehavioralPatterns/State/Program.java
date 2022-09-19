package BehavioralPatterns.State;

public class Program {
    public static void main(String[] args) {
        Context context = new Context();

        for (int i = 0; i < 6; i++) {
            context.execute();
            context.nextState();
        }
    }
}
