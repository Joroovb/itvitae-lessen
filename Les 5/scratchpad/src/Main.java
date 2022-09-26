import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        int leeftijd = 101;
//
//        if (leeftijd >= 18) {
//            System.out.println("Je bent welkom");
//            System.out.println("Je bent welkom");
//        } else if (leeftijd <= 16)
//            System.out.println("Ga naar huis");
//        else if (leeftijd < 15)
//            System.out.println("We gaan je ouders bellen");
//        else
//            System.out.println("Jij bent te jong");

        // guard clause
        boolean ouderDanHonderd = leeftijd > 100;

        if (ouderDanHonderd) {
            System.out.println("Ik bel de burgemeester");
            return;
        }

        // ingelogd

        // authorizatie



        if (leeftijd >= 18) {
            if (leeftijd > 45) {
                if (leeftijd > 100) {
                    System.out.println("Ik bel de burgemeester");
                }
                System.out.println("Ga naar huis");
            } else {
                System.out.println("kom binnen");
            }
        }
    }
}
