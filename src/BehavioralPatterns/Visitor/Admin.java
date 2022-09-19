package BehavioralPatterns.Visitor;

public class Admin implements Visitor{
    @Override
    public void openPage(HomePage homePage) {
        System.out.println("the administrator makes changes on the page");
    }

    @Override
    public void openPage(NewsPage newsPage) {
        System.out.println("the administrator updates the news");
    }
}
