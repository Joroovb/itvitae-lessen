import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char tekstCijfer = '-';
        System.out.print("Vul het cijfer in: ");
        int cijfer = input.nextInt();
        tekstCijfer = cijferGetal(cijfer);
        tekstCijfer = cijferGetal2(cijfer);

        System.out.println("Je hebt gehaald: " + tekstCijfer);
    }

    private static char cijferGetal2(int cijfer) {
        int[] scores = {25, 45, 50, 60, 80};
        char[] letters = {'F', 'E', 'D', 'C', 'B'};
        for (int i = 0; i < scores.length; i++) {
            if (cijfer < scores[i]) {
                return letters[i];
            }
        }
        return 'A';
    }

    private static char cijferGetal(int cijfer) {
        if (cijfer < 25) {
            return 'F';
        } else if (cijfer < 45) {
            return 'E';
        } else if (cijfer < 50) {
            return 'D';
        } else if (cijfer < 60) {
            return 'C';
        } else if (cijfer < 80) {
            return 'B';
        } else {
            return 'A';
        }
    }
}
