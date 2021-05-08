public class Evenement {
    private static double PRIJS = 35.0;
    private static double PARKEREN = 5.0;

    public static double getTotalePrijs(int leeftijd, boolean lid, int youngtimer, int maanden){
        double prijs = 0;
        double korting = 1;
        double parkeren = 0;

        if(leeftijd < 5){
            return prijs;
        } else if(leeftijd < 13){
            prijs = PRIJS/2;
        } else {
            prijs = PRIJS;
        }

        if(lid){
            korting -= 0.15;
        }

        if(youngtimer >= 25){
            parkeren = PARKEREN * 0.75;
        } else {
            parkeren = PARKEREN;
        }

        if (maanden >= 48){
            korting -= 0.1;
        }

        return (prijs * korting) + parkeren;
    }
}
