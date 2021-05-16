public class Main {
    public static void main(String[] args) {
        User user = new User("Toon","t.langendam@gmail.com","kiwi2000","ADMIN");
        new LoginHandler().loginUser(user);
    }
}
