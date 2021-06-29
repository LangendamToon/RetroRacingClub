import java.util.ArrayList;

public class SecretaryHandler extends UserHandler{
    @Override
    public void showUsers() {
        System.out.println("----------------------------------------");
        for(User user : users){
            if(!user.getRole().equals("ADMIN")) {
                System.out.println("Gebruiker: " + user.getName());
            }
        }
        System.out.println("----------------------------------------");
    }
}
