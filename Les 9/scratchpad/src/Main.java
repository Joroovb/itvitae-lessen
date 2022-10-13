import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] namen = {"Joris", "Melinoe", "Salem", "Dwarka"};

        // for
        // For loop gebruiken we wanneer we weten hoeveel iteraties we willen gaan maken

        //  init        eval    increment
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < namen.length; i++) {
            System.out.println(namen[i]);
        }

        // enhanced for loop

        //   declareren variabele - verzameling waar we doorheen loopen
        for (String naam : namen) {
            System.out.println(naam);
        }

        // while

        // Voor als we niet weten hoevaak we precies willen loopen

        //      zolang conditie true eval gaan we door met loopen
        boolean isGeldig = false;
        Scanner s = new Scanner(System.in);
        int ii = 50;
        while (!isGeldig) {
            System.out.print("Raad het getal");
            int gok = s.nextInt();
            if (gok == ii) {
                isGeldig = true;
            }
        }

        System.out.println("Goed geraden!");

        // do while

        // Wanneer we niet weten hoevaak we willen loopen,
        // maar wel dat we mininmaal 1 keer willen loppen.

//        do {
//
//        } while (true);


        outerloop:
        for (int i = 0; i < 10; i++) {
           innerloop:
           for(int j = 0; j < 20; j++) {
                System.out.println(i);
                if (i == 5) {
                    break outerloop;
                }
            }
        }


        int iii = 0;
        int jjj = 0;
        loopa:
        for (int i = 0; i < 10; i++) {
            loopb:
            for(int j = 0; j < 5; j++) {
                if (j == 3) {
                    continue loopb;
                } else if (i == 5) {
                    break loopa;
                }
                jjj += 1;
            }
            iii += 1;
        }

        System.out.println(iii);
        System.out.println(jjj);


    }
}
