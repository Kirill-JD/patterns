package BehavioralPatterns.Visitor;

public interface Visitor {
    void openPage(HomePage homePage);
    void openPage(NewsPage newsPage);
}
