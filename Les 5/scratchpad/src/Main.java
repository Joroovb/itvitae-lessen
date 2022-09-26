import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] getallen = {1, 6, 4, 1, 2, 9};

        naam: for (int getal : getallen) {
            if (getal == 4) {
                break naam;
            }

            if (getal == 1) {
                continue naam;
            }

            System.out.println(getal);
        }


    }
}
