import java.util.ArrayList;
import java.util.Scanner;

public class AdminHandler extends UserHandler {
    Scanner scanner = new Scanner(System.in);
    public User editUser(User user){
        System.out.println("----------------------------------------");
        System.out.println("Welk onderdeel van de gebruiker wilt u aanpassen?");
        System.out.println("1 : Naam : "+user.getName());
        System.out.println("2 : Email : "+user.getEmail());
        System.out.println("3 : Wachtwoord : "+user.getPassword());
        System.out.println("4 : Rol : "+user.getRole());
        System.out.println("----------------------------------------");
        Integer num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Voor de nieuwe naam in.");
                scanner.nextLine();
                String name = scanner.nextLine();
                user.setName(name);
                break;
            case 2:
                System.out.println("Voor de nieuwe email in.");
                scanner.nextLine();
                String email = scanner.nextLine();
                user.setEmail(email);
                break;
            case 3:
                System.out.println("Voor het nieuwe wachtwoord in.");
                scanner.nextLine();
                String pass = scanner.nextLine();
                user.setPassword(pass);
                break;
            case 4:
                System.out.println("Voor de nieuwe rol in.");
                scanner.nextLine();
                String role = scanner.nextLine();
                user.setRole(role);
                break;
        }
        System.out.println("Dit is de aangepaste gebruiker.");
        System.out.println("1 : Naam : "+user.getName());
        System.out.println("2 : Email : "+user.getEmail());
        System.out.println("3 : Wachtwoord : "+user.getPassword());
        System.out.println("4 : Rol : "+user.getRole());
        System.out.println("----------------------------------------");
        return user;
    }

    public void showUsers(){
        System.out.println("----------------------------------------");
        for(User user : users){
            System.out.println("Gebruiker: "+ user.getName());
        }
        System.out.println("----------------------------------------");
    }
}
