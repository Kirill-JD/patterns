package BehavioralPatterns.Visitor;

public class User implements Visitor{
    @Override
    public void openPage(HomePage homePage) {
        System.out.println("the user reads a brief information");
    }

    @Override
    public void openPage(NewsPage newsPage) {
        System.out.println("the user reads the news");
    }
}
