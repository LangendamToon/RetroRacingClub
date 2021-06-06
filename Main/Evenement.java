public class Evenement {
    private String name;
    private String date;
    private String circuit;

    public Evenement(String name, String date, String circuit){
        this.name = name;
        this.date = date;
        this.circuit = circuit;
    }

    public void showEvenement(){
        System.out.println("----------------------------------------");
        System.out.println("Evenement: "+name);
        System.out.println("Datum: "+date);
        System.out.println("Circuit: "+circuit);
        System.out.println("----------------------------------------");
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getCircuit() {
        return circuit;
    }
}
