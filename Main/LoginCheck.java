public class LoginCheck {
    private String email;
    private boolean nietBetaalt;
    private boolean blacklist;

    public LoginCheck(String E, boolean BE, boolean BL) {
       email = E;
       nietBetaalt = BE;
       blacklist = BL;
    }

    public boolean check(String emailVerified){
        return nietBetaalt || (!email.equals(emailVerified)) || blacklist;
    }
}
