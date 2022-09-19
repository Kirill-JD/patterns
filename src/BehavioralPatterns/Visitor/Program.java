package BehavioralPatterns.Visitor;

public class Program {
    public static void main(String[] args) {
        Visitor user = new User();
        Visitor admin = new Admin();

        Website homePage = new HomePage();
        Website newsPage = new NewsPage();

        homePage.accept(user);
        newsPage.accept(user);
        homePage.accept(admin);
        newsPage.accept(admin);
    }
}
