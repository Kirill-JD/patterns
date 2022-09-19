package BehavioralPatterns.Memento;

public class Program {
    public static void main(String[] args) {
        User user = new User();
        UserRepo userRepo = new UserRepo();

        user.setNameAndAge("user", 20);
        System.out.println(user);
        userRepo.setSave(user.save());

        user.setNameAndAge("Tom", 21);
        System.out.println(user);

        user.getUser(userRepo.getSave());
        System.out.println(user);
    }
}
