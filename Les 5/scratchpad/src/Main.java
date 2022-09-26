import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] namen = {"Joris", "Melinoe", "Salem"};

        for (int i = 0; i < namen.length; i++) {
            System.out.println("Hier woont: " + namen[i]);
        }

        for (String naam : namen) {
            System.out.println("Hier woont: " + naam);
        }
    }
}
