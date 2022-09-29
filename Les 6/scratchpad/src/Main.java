public class Main {
    public static void main(String[] args) {
        Kip k = new Kip();
        Vogel v = new Kip();
//        Kip kk = new Vogel();
        Vogel[] vogels = {new Kip(), new Vogel(), new Meeuw()};

        B b = new B();
        A a = b; // A a = type B
        System.out.println(a.naam());
        System.out.println(b.naam());
    }

}

class A {
    int a = 3;
    String naam() {
        return "a";
    }
}

class B extends A {

    int a = 4;
    String naam() {
        System.out.println(super.a + a);
        return super.naam() + "b";

    }
}

class Vogel {
    static int aantal = 10;
    static void getNaam() {
        System.out.println("Ik ben een vogel");
    }
}

class Kip extends Vogel {
    static void getNaam() {
        System.out.println("Ik ben een kip");
    }
}

class Meeuw extends Vogel {

}