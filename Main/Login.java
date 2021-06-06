import java.util.ArrayList;

public class Login {
    private ArrayList<User> users = new ArrayList<User>();
    private static Login singleton;

    private Login(){
        UserHandler userHandler = new UserHandler();
        users = userHandler.getUsers();
    }

    public static Login getInstance(){
        if (singleton == null){
            singleton = new Login();
        }
        return singleton;
    }

    public void loginUser(User user){
        for (User loginUser : users){
            if(loginUser.getEmail().equals(user.getEmail()) && loginUser.getPassword().equals(user.getPassword())){
                System.out.println("U bent nu ingelogd");
                System.out.println("Wat wilt u doen?");
                return;
            }
        }
        System.out.println("Verkeerd wachtwoord of email");
    }
}
