import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
//        LocalDate d = LocalDate.of(2022, Month.FEBRUARY, 29);
//        System.out.println(d);

        LocalTime t = LocalTime.of(12, 12, 12, 12);
        LocalTime tt = LocalTime.now();

        System.out.println(tt);
    }
}
