// Encapsulation
// private attributes, public methods

class Hond {
    String naam;
    final int geboorteDatum = 1234;
    static int aantalHonden;
    static final String LATIJNSE_NAAM = "Canine";
}

//class Persoon {
//    int leeftijd;
//    final String oogKleur;
//    static int aantalPersonen;
//    static final String LATIJNSE_NAAM = "Homo Sapien"
//}
//
//class Melk {
//    int aantalDagenHoudbaar;
//    final String batch;
//    static int aantalLitersMelk;
//    static final String kleur;
//}
//
//class Voertuig {
//    String naam;
//    final int productieJaar;
//    static int aantalInProductie;
//    static final boolean kanRijden;
//}

class Parent {
    static int leeftijd;
}

class Child extends Parent {

}

public class Vogel {
    int aantalVleugels; // 0
    private String naam;
    String voeding;
    static int MAX_LEEFTIJD = 40;

//    abstract void eten();

    public Vogel() {

    }

    public Vogel(String jojo, int jo, String jojojo) {

    }

//    public Vogel(int aantalVleugels, String naam, String voeding) {
//        this.aantalVleugels = aantalVleugels;
//        this.naam = naam;
//        this.voeding = voeding;
//    }

    public void vliegen() {
        System.out.println("Ik ga vliegen");
    }

    public void vliegen(String naam) {

    }

    public void zegNaam() {
        System.out.println("Mijn naam is: " + naam);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

}
