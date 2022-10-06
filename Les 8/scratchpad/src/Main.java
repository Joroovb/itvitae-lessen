public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Auto a = new Auto(2);
//        a.passagiers = 2;
        System.out.println(a.passagiers);
        Rijdbaar b = a;
        b.rijden();

        Rijdbaar scoot = new Scooter();
        scoot.rijden();
        // Abstracte klassen kan je niet instantieren
//        Voertuig v = new Voertuig();
        Wheelybaar w = new Scooter();
        w.wheelyTrekken();
    }
}

// 4 klasses maken
// 1 Grootouder, abstract
// 2 ouders te staan
// 1 kind

// 3 interfaces maken, ieder met min 1 methode
// Verschillende klasses implementeren de interfaces

// Vervolgens,
// Instanties aanmaken van de klasses, en methodes uit laten voeren.
// Spelen met verschillende referentietypen

// Contract, waarbij gedrag kunnen vastleggen
interface Bestuurbaar {
    void besturen();
}

interface Rijdbaar {
    // Interface heeft altijd variabelen die static final
    int a = 1;
    void rijden();
}

interface Wheelybaar {
    void wheelyTrekken();
}

// Klasse mag erven van max 1 superklasse, Klasse mag meerdere interfaces implementeren
class Scooter extends Voertuig implements Rijdbaar, Wheelybaar {
    @Override
    public void rijden() {
        System.out.println("Vroem op de tomos");
    }

    @Override
    public void tanken() {
        System.out.println("Ik ga met de jerrycan tanken");
    }

    @Override
    public void wheelyTrekken() {
        System.out.println("Pas op dat je niet valt");
    }
}

abstract class Voertuig implements Bestuurbaar {
   // Abstracte klasse kan instantie variabelen hebben
    int passagiers;

    @Override
    public void besturen() {
        System.out.println("Je kan dit voertuig besturen");
    }

    // Als je een abstracte methode definieerd, moet de klasse abstract zijn
    abstract public void tanken();

    void test() {
        System.out.println("Ik ben een voertuig");
    }
}

//    auto is een voertuig
class Auto extends Voertuig implements Rijdbaar {

    public Auto() {
        // this() roept andere constructor van zelfde klasse aan
        this(2);
    }

    @Override
    public void tanken() {
        System.out.println("Ik zoef langs het tankstation");
    }

    // Constructor
    public Auto(int passagiers) {
        this.passagiers = passagiers;
        super.test();
    }

    @Override
    public void rijden() {
        System.out.println("Vroem vroem, lekker rijden");
    }
}

class BMW extends Auto {

    public BMW() {
        //super() roept constructor van parent aan
        super(4);

        // super roept parent aan
        super.test();
    }

}


// Hello, World! V

// Inheritance V
// Super en superklassen V
// interfaces V
// Abstracte klassen V
// Wanneer interface vs Abstracte klasse V

// Exceptions
// Lambda expressie
// Arraylist
// Git