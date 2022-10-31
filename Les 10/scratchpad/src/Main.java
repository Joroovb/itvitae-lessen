public class Main {
    public static void main(String[] args) {
        // Garbage collector
        // Eligible for garbage collection

        VogelKooi kooi = new VogelKooi();
        Vogel V = new Vogel("Pieter de vogel");
        Vogel V2 = new Vogel("Jan de Vogel");
        kooi.vogels[0] = V;
        kooi.vogels[1] = new Vogel(null);

        V = V2;
        V2 = null;
        kooi.vogels[0] = null;
        System.out.println(kooi.vogels[0].naam);
    }
}

class Vogel {
    String naam;

    Vogel(String naam) {
        this.naam = naam;
    }
}

class VogelKooi {
    Vogel[] vogels = new Vogel[2];
}

