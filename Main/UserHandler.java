import java.util.ArrayList;

public abstract class UserHandler {
    protected ArrayList<User> users = new Database().getUsers();

    public abstract void showUsers();
}
