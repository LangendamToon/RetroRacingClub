import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer je email in.");
        String email = scanner.nextLine();
        System.out.println("Voer je wachtwoord in.");
        String password = scanner.nextLine();

        User user = Login.getInstance().loginUser(email,password);
        Menu menu = new Menu(user);
    }
}
