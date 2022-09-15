import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //256 128 64 32 16 8 4 2 1
        //                       0 => 0
        //                       1 => 1
        //                     1 0 => 2
        //                     1 1 => 3
        // 0    0  0  1  0 0 1 0 1 => 37
        // 0    1  0  0  1 1 0 1 0 => 154
        // 0    0  0  0  0 0 0 0 0  => 0
        // 0    1  0  1  1 1 1 1 1 => 191

        // 4 => 0100
        // 1 => 0001
        // =>   0101 uitkomst van 1 | 4
        // ^
        // 5 => 0101
        // 1 => 0001
        // =>   0100 => 4

//        int getal = 100;
//        System.out.println(getal);




    }
}
