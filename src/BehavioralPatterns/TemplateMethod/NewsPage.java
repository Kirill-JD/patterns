package BehavioralPatterns.TemplateMethod;

public class NewsPage extends WebsiteTemplate{
    @Override
    public void content() {
        System.out.println("News");
    }
}
