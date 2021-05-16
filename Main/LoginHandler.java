public class LoginHandler {
    public LoginHandler(){
    }

    public void loginUser(User user){
        if(user.getEmail().equals("t.langendam@gmail.com") && user.getPassword().equals("kiwi2000")){
            System.out.println("U bent nu ingelogd");
        }
    }
}
