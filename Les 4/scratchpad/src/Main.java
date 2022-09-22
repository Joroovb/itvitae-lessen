import java.util.Arrays;
import java.util.Scanner;

public class Main {

    Scanner in = new Scanner(System.in);
    Scanner in2 = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        System.out.print("Voer het aantal items in: ");
        int getal = m.inputLengte();
        System.out.println("U heeft " + getal + " getallen gekozen.");
        System.out.println("Voer uw getallen in: ");
        System.out.print(Arrays.toString(m.arrayValues(getal)));

//       Scanner input = new Scanner(System.in);
//        System.out.print("Voer het aantal items in: ");
//
//        int NUM_ITEMS = input.nextInt();
//        System.out.print("Voer de waarde van alle items in gescheiden door spaties: ");
//
//        int[] items = new int[NUM_ITEMS];
//
//        for (int i = 0; i < NUM_ITEMS; i++) {
//            items[i] = input.nextInt();
//        }
//
//        System.out.println(Arrays.toString(items));
//
//
//        System.out.print("De waarden zijn [");
//
//
//        for (int i = 0; i < NUM_ITEMS; i++) {
//            System.out.print(items[i]);
//            if (i < NUM_ITEMS -1) {
//                System.out.print(", ");
//            }
//        }
//
//        System.out.println("]");
//
//        for (int item : items) {
//            System.out.println("*".repeat(item));
//        }
    }

    private int[] arrayValues(int getal) {
        String rawItems = in2.nextLine();
        String[] arrayItems = rawItems.split(" ");
        int[] items = new int[arrayItems.length];
        for (int i = 0; i < arrayItems.length; i++) {
            items[i] = Integer.parseInt(arrayItems[i]);
        }
        return items;
    }

    private int inputLengte() {
        int NUM_ITEMS = in.nextInt();
        return NUM_ITEMS;
    }
}