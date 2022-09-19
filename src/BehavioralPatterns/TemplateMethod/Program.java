package BehavioralPatterns.TemplateMethod;

public class Program {
    public static void main(String[] args) {
        WebsiteTemplate homePage = new HomePage();
        WebsiteTemplate newsPage = new NewsPage();

        homePage.showSite();
        newsPage.showSite();
    }
}
