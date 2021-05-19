import java.util.ArrayList;

public class Login {
    private ArrayList<User> users = new ArrayList<User>();
    private static Login singleton;

    private Login(){
        users.add(new User("Toon","t.langendam@gmail.com","kiwi2000","ADMIN"));
        users.add(new User("Joep","joep@gmail.com","kiwi2001","USER"));
        users.add(new User("Piet","piet@gmail.com","kiwi2002","USER"));
        users.add(new User("Jan","jan@gmail.com","kiwi2003","USER"));
    }

    public static Login getInstance(){
        if (singleton == null){
            singleton = new Login();
        }
        return singleton;
    }

    public void loginUser(User user){
        if(user.getEmail().equals("t.langendam@gmail.com") && user.getPassword().equals("kiwi2000")){
            System.out.println("U bent nu ingelogd");
        }
    }
}
