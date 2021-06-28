import java.util.ArrayList;

public class UserHandler {
    private ArrayList<User> users = new ArrayList<User>();
    public UserHandler(){
        users.add(new User("Toon","t.langendam@gmail.com","kiwi2000","ADMIN"));
        users.add(new User("Joep","joep@gmail.com","kiwi2001","USER"));
        users.add(new User("Piet","piet@gmail.com","kiwi2002","USER"));
        users.add(new User("Jan","jan@gmail.com","kiwi2003","SECRETARY"));
    }

    public void showUsers(){
        System.out.println("----------------------------------------");
        for(User user : users){
            System.out.println("Gebruiker: "+ user.getName());
        }
        System.out.println("----------------------------------------");
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
