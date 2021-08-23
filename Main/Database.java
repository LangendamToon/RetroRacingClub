import java.util.ArrayList;

public class Database {
    ArrayList<User> users = new ArrayList<User>();

    public Database(){
        users.add(new User("Toon","t.langendam@gmail.com","kiwi2000","ADMIN"));
        users.add(new User("Joep","joep@gmail.com","kiwi2001","USER"));
        users.add(new User("Piet","piet@gmail.com","kiwi2002","USER"));
        users.add(new User("Jan","jan@gmail.com","kiwi2003","SECRETARY"));
    }

    public ArrayList<User> getUsers(){
        return users;
    }
}
