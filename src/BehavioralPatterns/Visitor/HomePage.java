package BehavioralPatterns.Visitor;

public class HomePage implements Website{
    @Override
    public void accept(Visitor visitor) {
        visitor.openPage(this);
    }
}
