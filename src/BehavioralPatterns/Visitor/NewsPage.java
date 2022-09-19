package BehavioralPatterns.Visitor;

public class NewsPage implements Website{
    @Override
    public void accept(Visitor visitor) {
        visitor.openPage(this);
    }
}
