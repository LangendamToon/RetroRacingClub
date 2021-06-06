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

    public User loginUser(String email, String password){
        for (User loginUser : users){
            if(loginUser.getEmail().equals(email) && loginUser.getPassword().equals(password)){
                System.out.println("U bent nu ingelogd");
                return loginUser;
            }
        }
        System.out.println("Verkeerd wachtwoord of email");
        return null;
    }
}
