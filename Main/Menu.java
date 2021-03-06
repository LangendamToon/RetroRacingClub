import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static ArrayList<User> users = new AdminHandler().getUsers();
    private static Evenement ev = new Evenement("Historic Grand Prix", "24/05/2022", "Zandvoort/Nederland");
    private static Scanner scanner = new Scanner(System.in);

    public Menu(User user){
        menu(user);
    }

    public static void menu(User user) {
        if(user.getRole().equals("ADMIN")){
            menuItemAdmin();
            Integer num = scanner.nextInt();
            menuProcesAdmin(num);
        } else if(user.getRole().equals("SECRETARY")){
            menuItemSecretary();
            Integer num = scanner.nextInt();
            menuProcesSecretary(num);
        } else {
            menuItemUser();
            Integer num = scanner.nextInt();
            menuProcesUser(num);
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

    private static void menuProcesAdmin(Integer num){
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
                User editUser = users.get(numI - 1);
                new AdminHandler().editUser(editUser);
                break;
            case 3:
                new AdminHandler().showUsers();
                break;
        }
    }

    private static void menuProcesSecretary(Integer num){
        switch (num) {
            case 1:
                ev.showEvenement();
                break;
            case 2:
                new SecretaryHandler().showUsers();
                break;
        }
    }

    private static void menuProcesUser(Integer num){
        switch (num) {
            case 1:
                ev.showEvenement();
                break;
        }
    }
}
