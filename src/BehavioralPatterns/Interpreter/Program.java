package BehavioralPatterns.Interpreter;

public class Program {
    public static void main(String[] args) {
        String str = "TesT";
        Context context = new Context();

        Expression loverExpression = new LowerExpression(str);
        str = loverExpression.interpret(context);
        System.out.println(str);

        Expression upperExpression = new UpperExpression(str);
        str = upperExpression.interpret(context);
        System.out.println(str);
    }
}
