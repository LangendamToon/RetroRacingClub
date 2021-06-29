import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static ArrayList<User> users = new ArrayList<User>();

    public Menu(User user){
        menu(user);
    }

    public static void menu(User user) {

        Scanner scanner = new Scanner(System.in);
        Evenement ev = new Evenement("Historic Grand Prix", "24/05/2022", "Zandvoort/Nederland");
        users = new AdminHandler().getUsers();

        if(user.getRole().equals("ADMIN")){
            menuItemAdmin();
            Integer num = scanner.nextInt();
            switch (num) {
                case 1:
                    ev.showEvenement();
                    break;
                case 2:
                    System.out.println("Welke gebruiker wil je aanpassen?");
                    int i = 0;
                    for(User user1 : users){
                        i++;
                        System.out.println(i+" : "+ user1.getName());
                    }
                    Integer numI = scanner.nextInt();
                    User editUser = new User(null,null,null,null);
                    if(numI == 1) {
                        editUser = users.get(0);
                    } else if (numI == 2) {
                        editUser = users.get(1);
                        break;
                    } else if(numI == 3) {
                        editUser = users.get(2);
                    } else {
                        editUser = users.get(3);
                    }
                    new AdminHandler().editUser(editUser);
                    break;
                case 3:
                    new AdminHandler().showUsers();
                    break;
            }
        } else if(user.getRole().equals("SECRETARY")){
            menuItemSecretary();
            Integer num = scanner.nextInt();
            switch (num) {
                case 1:
                    ev.showEvenement();
                    break;
                case 2:
                    new SecretaryHandler().showUsers();
                    break;
            }
        } else {
            menuItemUser();
            Integer num = scanner.nextInt();
            switch (num) {
                case 1:
                    ev.showEvenement();
                    break;
            }
        }
        backToMenu(user);

    }

    public static void backToMenu(User user) {
        Scanner jaNee = new Scanner(System.in);
        System.out.println("terug naar het menu? \n(ja/nee)");
        String jaNeeInput = jaNee.nextLine();

        if (jaNeeInput.equals("ja") || jaNeeInput.equals("Ja")) {
            menu(user);
        } else {
            if (jaNeeInput.equals("nee") || jaNeeInput.equals("Nee")) {
                System.out.println("exiting...");
            } else {
                System.out.println("onbekende input");
            }
        }

    }

    private static void menuItemUser(){
        System.out.println("----------------------------------------");
        System.out.println("Wat wilt u doen?");
        System.out.println("1 : Evenement bekijken");;
        System.out.println("----------------------------------------");
    }

    private static void menuItemSecretary(){
        System.out.println("----------------------------------------");
        System.out.println("Wat wilt u doen?");
        System.out.println("1 : Evenement bekijken");;
        System.out.println("2 : Gebruikers bekijken");
        System.out.println("----------------------------------------");
    }

    private static void menuItemAdmin(){
        System.out.println("----------------------------------------");
        System.out.println("Wat wilt u doen?");
        System.out.println("1 : Evenement bekijken");
        System.out.println("2 : Gebruikers Aanpassen");
        System.out.println("3 : Gebruikers bekijken");
        System.out.println("----------------------------------------");
    }

}
