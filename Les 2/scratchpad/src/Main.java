import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int getal = 1; // is
        getal += 1;
        getal = getal + 1; // hetzelfde als regel erboven
        getal -= 1;
        getal /= 1; // getal = getal / 1;

        getal = 1 + 1; // optellen
        getal = 1 - 1; // aftrekken
        getal = 1 * 2; // keer
        getal = 2 / 2; // delen
        getal = 10 % 3; // modulus

        getal = 10;
//        getal++; // postfix increment
//        ++getal; // prefix increment

        System.out.println(getal++);
        System.out.println(getal++);
        System.out.println(++getal);

        boolean b = getal > 10; // groter
        b = getal < 10; // kleiner
        b = getal >= 10; // groter dan of gelijk aan
        b = getal <= 10; // kleiner dan of gelijk aan
        b = getal == 10; // gelijk aan
        b = getal != 10; // niet gelijk aan

        System.out.println(!b); // boolean flippen
        b = getal <  10 && getal < 6; // and operator short circuited
        b = getal <  10 & getal < 6; // and operator
        b = getal > 12 || getal++ < 10; // or operator short circuited
        b = getal > 12 | getal < 10; // or operator

        System.out.println(getal);
        System.out.println(b);



    }
}
