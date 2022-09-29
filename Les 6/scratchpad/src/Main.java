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

abstract class Vogel {
    int aantalVleugels;
    String snavelVorm;
    String naam;

    abstract void vliegen();

    @Override
    public String toString() {
        return "Ik ben een vogel";
    }
}

class Kip extends Vogel {

    public Kip() {

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