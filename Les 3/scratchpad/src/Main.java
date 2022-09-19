public class Main {


    public static void main(String[] args) {
        Persoon p = new Persoon("Joris", 29);
        Persoon baby = new Persoon("Jan");
    }
}

class Persoon {
    String naam;
    int leeftijd; // default waarde = 0

    public Persoon(String naam, int leeftijd) {
        this(naam);
        System.out.println("2 argumenten");
        this.leeftijd = leeftijd;
    }

    public Persoon(String naam) {
        this();
        System.out.println("1 argument");
        this.naam = naam;
    }

    public Persoon() {

    }
}

