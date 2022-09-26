import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int getal = input.nextInt();
        System.out.print("Fibonacci: " + fibonacci2(getal));

    }

    private static int fibonacci(int getal) {
        return getal == 0 ? 0 : ((getal == 1) ? 1 : fibonacci(getal - 1 ) + fibonacci(getal -2));
    }

    private static int fibonacci2(int getal) {
        return getal < 2 ? getal : fibonacci2(getal - 1) + fibonacci2(getal - 2);
    }


}
