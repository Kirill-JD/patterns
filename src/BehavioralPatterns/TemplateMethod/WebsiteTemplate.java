package BehavioralPatterns.TemplateMethod;

public abstract class WebsiteTemplate {
    public void showSite() {
        System.out.println("Logo");
        System.out.println("Header");
        content();
    }
    public abstract void content();
}
