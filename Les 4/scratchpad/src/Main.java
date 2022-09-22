import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Voer het aantal items in: ");

        int NUM_ITEMS = input.nextInt();
        System.out.print("Voer de waarde van alle items in gescheiden door spaties: ");

        int[] items = new int[NUM_ITEMS];

        for (int i = 0; i < NUM_ITEMS; i++) {
            items[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(items));


        System.out.print("De waarden zijn [");


        for (int i = 0; i < NUM_ITEMS; i++) {
            System.out.print(items[i]);
            if (i < NUM_ITEMS -1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        for (int item : items) {
            System.out.println("*".repeat(item));
        }

    }
}