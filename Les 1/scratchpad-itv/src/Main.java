import Universiteit.Examen;
import com.jorisvanbreugel.Hello;

public class Main {
    public static void main(String[] jojo) {

        for (int i = 0; i < jojo.length; i++) {
            System.out.println(jojo[i]);
        }

//        System.out.println(jojo[0]);
//        System.out.println(jojo[1]);
//        System.out.println(jojo[2]);

        Vogel v;
//        v = new Vogel(2, "Pietje", "Zaden");
        v = new Vogel();
        Vogel v2 = new Vogel();
        Child.leeftijd = 25;
        Parent.leeftijd = 30;
        System.out.println(Child.leeftijd);
        System.out.println(Parent.leeftijd);

        System.out.println(Vogel.MAX_LEEFTIJD);
        System.out.println(v.MAX_LEEFTIJD);
        v2.MAX_LEEFTIJD = 30;
        System.out.println(v.MAX_LEEFTIJD);

//        v.MAX_LEEFTIJD = 100;
        System.out.println(v.getNaam());

        v.setNaam("Jantje");
        System.out.println(v.getNaam());


//        Vogel v2;
//        v2 = new Vogel();
//
//        v2.aantalVleugels = 3;
//        v2.naam = "Pietje";
//        v2.voeding = "Zaden";

//        System.out.println(v2.aantalVleugels);
    }
}