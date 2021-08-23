import java.util.ArrayList;
import java.util.Scanner;

public class AdminHandler extends UserHandler {

    public void showUsers(){
        System.out.println("----------------------------------------");
        for(User user : users){
            System.out.println("Gebruiker: "+ user.getName());
        }
        System.out.println("----------------------------------------");
    }
}
