import java.util.Scanner;

public class Menu {
    public Menu(User user){
        menu(user);
    }

    public static void menu(User user) {

        Scanner scanner = new Scanner(System.in);
        Evenement ev = new Evenement("Historic Grand Prix", "24/05/2022", "Zandvoort/Nederland");

        if(user.getRole().equals("ADMIN")){
            System.out.println("----------------------------------------");
            System.out.println("Wat wilt u doen?");
            System.out.println("1 : Evenement bekijken");
            System.out.println("2 : Gebruikers Aanpassen");
            System.out.println("3 : Gebruikers bekijken");
            System.out.println("----------------------------------------");
            Integer num = scanner.nextInt();
            switch (num) {
                case 1:
                    ev.showEvenement();
                    break;
                case 2:
                    new AdminHandler().editUser(user);
                    break;
                case 3:
                    new AdminHandler().showUsers();
                    break;
            }
        } else if(user.getRole().equals("SECRETARY")){
            System.out.println("----------------------------------------");
            System.out.println("Wat wilt u doen?");
            System.out.println("1 : Evenement bekijken");;
            System.out.println("2 : Gebruikers bekijken");
            System.out.println("----------------------------------------");
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
            System.out.println("----------------------------------------");
            System.out.println("Wat wilt u doen?");
            System.out.println("1 : Evenement bekijken");;
            System.out.println("----------------------------------------");
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

}
