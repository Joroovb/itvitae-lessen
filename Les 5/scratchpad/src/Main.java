import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // while
        int i = 0;
        int[] list = new int[7];

        while (i < list.length) {
            list[i] = i +2;
            i++;
        }

        //do while
        i = 0;
        list = new int[7];

        do {
            list[i] = i + 2;
            i++;
        } while (i < list.length);

        System.out.println(list[6]);


        System.out.println(list[2]);

        int count = 0;

        do {

        } while (count < 100);

        while (count < 100) {
            System.out.println(count);
            count += 2;
        }
    }
}
