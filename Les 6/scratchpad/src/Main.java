public class Main {
    public static void main(String[] args) {
        Kip kip = new Kip();
        kip.naam = "Joke";
        kip.tokken();
//        Vogel v = new Vogel(); // geen instantie van abstracte klasse
//        v.vliegen();
//        System.out.println(v);
        kip.vliegen();
        System.out.println(kip);
    }

}

class Vogel {
    int aantalVleugels;
    String snavelVorm;
    String naam;

    public Vogel() {}

    public Vogel(String naam) {
        System.out.println("Vogel constructor");
        this.naam = naam;
    }

    void vliegen() {

    }

    @Override
    public String toString() {
        return "Ik ben een vogel";
    }
}

class Kip extends Vogel {

    Kip() {
      super("Onbekend");
    }

    Kip(String naam) {
        super(naam);
    }

    void tokken() {
        System.out.println("Tok tok tok");
    }

    void vliegen() {
        System.out.println("Ik kan niet vliegen");
    }

    @Override
    public String toString() {
        return "Ik ben een kip";
    }

    public String toString2() {
        return "Ik ben een kip2";
    }
}