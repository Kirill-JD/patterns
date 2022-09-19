package BehavioralPatterns.TemplateMethod;

public class HomePage extends WebsiteTemplate{
    @Override
    public void content() {
        System.out.println("Hello");
    }
}
