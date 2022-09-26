import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        String okee;
        int leeftijd = 17;
//              conditie        Waarde als waar  Waarde als niet waar
        okee = leeftijd >= 18 ? "Okee" :        "Niet okee";

        System.out.println(okee);
    }
}
