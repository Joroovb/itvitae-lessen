public class Main {


    public static void main(String[] args) {
        Persoon p1 = new Persoon("Piet");
//        Persoon p2 = new Persoon("Jan");
//        System.out.println("Voor wissel: " + p1.naam + p2.naam);
//        wissel(p1, p2);
//        System.out.println("Na wissel: " + p1.naam + p2.naam);
        System.out.println(p1.naam);
        resetNaam(p1);
        System.out.println(p1.naam);

    }
    public static void wissel(Persoon p1, Persoon p2) {
        Persoon temp = p1; // Temp verwijst naar p1
        p1 = p2; // p1 verwijst naar p2
        p2 = temp; // p2 verwijst naar p1
        p2.naam = "Joris"; // we passen p2 (p1 in main methode) aan
    }

    public static void resetNaam(Persoon p) {
        p.naam = "Joris";
    }
}

class Persoon { // encapsulation
    public String naam;

    Persoon(String naam) {
        this.naam = naam;
    }

}

