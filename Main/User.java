import java.util.Scanner;

public class User {
    private String name;
    private String email;
    private String password;
    private String role;
    Scanner scanner = new Scanner(System.in);

    public User(String name, String email, String password, String role){
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getRole(){
        return role;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void showUser(){
        System.out.println("1 : Naam : "+name);
        System.out.println("2 : Email : "+email);
        System.out.println("3 : Wachtwoord : "+password);
        System.out.println("4 : Rol : "+role);
    }

    public void editUser(){
        System.out.println("----------------------------------------");
        System.out.println("Welk onderdeel van de gebruiker wilt u aanpassen?");
        showUser();
        System.out.println("----------------------------------------");
        Integer num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Voor de nieuwe naam in.");
                scanner.nextLine();
                String name = scanner.nextLine();
                this.name = name;
                break;
            case 2:
                System.out.println("Voor de nieuwe email in.");
                scanner.nextLine();
                String email = scanner.nextLine();
                this.email = email;
                break;
            case 3:
                System.out.println("Voor het nieuwe wachtwoord in.");
                scanner.nextLine();
                String pass = scanner.nextLine();
                this.password = password;
                break;
            case 4:
                System.out.println("Voor de nieuwe rol in.");
                scanner.nextLine();
                String role = scanner.nextLine();
                this.role = role;
                break;
        }
        System.out.println("----------------------------------------");
        System.out.println("Dit is de aangepaste gebruiker.");
        showUser();
        System.out.println("----------------------------------------");
    }
}
