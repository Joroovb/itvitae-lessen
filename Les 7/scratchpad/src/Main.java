import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Math.sqrt(-1));
//
//        int uitkomst = 15 / 0;
//        System.out.println(uitkomst);

//        int a = Integer.parseInt("-1");
//        System.out.println(a);
//        ArrayList<String> aa = new ArrayList<>();
//        aa.get(1);

        Meeuw m = new Meeuw();
        Vogel v = new Vogel();
        Persoon p = new Persoon();

//        if (v instanceof Vogel) {
//            System.out.println("Ik ben een vogel");
//        }

//        System.out.println(77.0 / 0);
//        System.out.println(77.0 / 0.0);
//        System.out.println(0.0 / 0);

//        System.out.println(-1 / 0.0);

//        double infin = 1.0 / 0;
//        System.out.println(infin);
//
//        double dubbelinfin = infin / 0;
//        System.out.println(dubbelinfin);
//
//        System.out.println(10 / infin);

//        System.out.println((double) 100 / 0);

//        int abc = Integer.parseInt("123_45");
//        int abc = 123456789;
//        System.out.println(abc);

        new Main().nogEenKeer();
    }

    void nogEenKeer() {
        System.out.println("Nog een keer!");
        nogEenKeer();
    }
}

class Vogel {
    {
        System.out.println("ja hoor");
    }

    static {
        System.out.println("Statisch");
    }

    Vogel() {
        System.out.println("In constructor");
    }
}

class Meeuw extends Vogel {

}

class Persoon {

}