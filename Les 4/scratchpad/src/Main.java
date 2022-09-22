import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> namen = new ArrayList<>();
        String[] namen2 = new String[4];
        namen.add("Joris");
        namen.add("Melinoe");
        namen.add(1,"Salem");

        System.out.println(namen);

        for (String naam : namen) {
            System.out.println(naam);
        }

        for (int i = 0; i < namen.size(); i++) {
            System.out.println(namen.get(i));
            if (namen.get(i).equals("Salem")) {
                namen.set(i, "Chili");
            }
        }
        System.out.println(namen);
        System.out.println(namen.indexOf("Salem"));

        namen.remove(0);
        System.out.println(namen);
        namen.remove("Chili");
        System.out.println(namen);


        ArrayList<Integer> getallen = new ArrayList<>();
        getallen.add(1);
        getallen.add(2);
        getallen.add(3);
        System.out.println(getallen);

        getallen.remove(Integer.valueOf(2));
        System.out.println(getallen);
    }
}