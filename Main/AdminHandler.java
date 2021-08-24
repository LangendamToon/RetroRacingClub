import java.util.ArrayList;
import java.util.Scanner;

public class AdminHandler extends UserHandler {

    public void showUsers(){
        System.out.println("----------------------------------------");
        int i = 0;
        for(User user : users){
            i++;
            System.out.println(i +" : "+ user.getName());
        }
        System.out.println("----------------------------------------");
    }
}
