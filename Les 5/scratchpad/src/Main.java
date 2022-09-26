import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Tafelmaker: Geef de grootte aan: ");
        int grootte = input.nextInt();

        System.out.print("* | ");
        for (int i = 1; i <= grootte; i++) {
            System.out.print(" " + (i < 10 ? " " + i : i));
        }

        System.out.println();

        System.out.println("---".repeat(grootte + 1));

        for (int i = 1; i <= grootte; i++) {
            System.out.print((i < 10 ? " " + i : i)+ "|");
            for (int j = 1; j <= grootte; j++) {
                int ij = i * j;
                System.out.print(" " + (ij < 10 ? " " + ij : ij));
            }
            System.out.println();
        }



//        int[] getallen = {1, 2, 3, 4, 5, 6};
//        int som = 0;
//        //  init           ; eval     ;  stap
//        for (int index = 0; index < 10; index++) {
////            int som = 0;
//            som += index;
////            System.out.println(som);
//
//        }
////        System.out.println(som);
//
//        for (int index = 0; index < getallen.length; index++) {
////            System.out.println(getallen[index]);
//        }
//
//        outer: for (int uren = 1; uren <= 6; uren++) {
//            for (int min = 0; min < 60; min++) {
//                if (uren == 3 && min == 45) {
//                    System.out.println(uren + " : " + min);
//                    break outer;
//                }
//                System.out.println(uren + " : " + min);
//
//            }
//        }
    }
}
