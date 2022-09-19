package BehavioralPatterns.Observer;

public class Program {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();
        jobSite.addVacancy("first job");
        jobSite.addVacancy("second job");

        Observer user1 = new User("Tom");
        Observer user2 = new User("Bob");

        jobSite.addObserver(user1);
        jobSite.addObserver(user2);

        jobSite.addVacancy("third job");
        jobSite.removeVacancy("second job");
    }
}
