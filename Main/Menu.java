import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static Evenement ev = new Evenement("Historic Grand Prix", "24/05/2022", "Zandvoort/Nederland");
    private static Scanner scanner = new Scanner(System.in);
    private User user;

    public Menu(User user){
        this.user = user;
        menu();
    }

    public void menu() {
        if(this.user.getRole().equals("ADMIN")){
            menuItemAdmin();
            Integer num = scanner.nextInt();
            menuProcesAdmin(num);
        } else if(this.user.getRole().equals("SECRETARY")){
            menuItemSecretary();
            menuLine();
            Integer num = scanner.nextInt();
            menuProcesSecretary(num);
        } else {
            menuItemUser();
            menuLine();
            Integer num = scanner.nextInt();
            menuProcesUser(num);
        }
        backToMenu();
    }

    public void backToMenu() {
        Scanner jaNee = new Scanner(System.in);
        System.out.println("terug naar het menu? \n(ja/nee)");
        String jaNeeInput = jaNee.nextLine();

        if (jaNeeInput.equals("ja") || jaNeeInput.equals("Ja")) {
            menu();
        } else {
            if (jaNeeInput.equals("nee") || jaNeeInput.equals("Nee")) {
                System.out.println("exiting...");
            } else {
                System.out.println("onbekende input");
            }
        }

    }

    public static void menuLine(){
        System.out.println("----------------------------------------");
    }

    private static void menuItemUser(){
        menuLine();
        System.out.println("Wat wilt u doen?");
        System.out.println("1 : Evenement bekijken");
    }

    private static void menuItemSecretary(){
        menuItemUser();
        System.out.println("2 : Gebruikers bekijken");
    }

    private static void menuItemAdmin(){
        menuItemSecretary();
        System.out.println("3 : Gebruikers aanpassen");
        menuLine();
    }

    private static void menuProcesAdmin(Integer num){
        switch (num) {
            case 1:
                ev.showEvenement();
                break;
            case 2:
                System.out.println("Welke gebruiker wil je aanpassen?");
                new AdminHandler().showUsers();
                Integer numI = scanner.nextInt();
                User editUser = new Database().getUsers().get(numI - 1);
                editUser.editUser();
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
