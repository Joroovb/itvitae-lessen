public class Main {
    public static void main(String[] args) {
        // Garbage collector
        // Eligible for garbage collection
        int a = 8;
        Vogel V = new Vogel("Pieter de vogel");
        Vogel V2 = new Vogel("Jan de Vogel");
        V.eten(V2);
        V.aantalFladderen(a);
        System.out.println(a);
        System.out.println(V2.naam);
    }
}

class Vogel {
    String naam;

    Vogel(String naam) {
        this.naam = naam;
    }

    void aantalFladderen(int fladders) {
        for(int i = 0; i < fladders; ++i){
            System.out.println("Fladder");
        }
        fladders = 9;
    }

    void eten(Vogel v) {
        System.out.println("Lekker " + v.naam + " eten");
        v.naam = "Bob de vogel";
    }
}

