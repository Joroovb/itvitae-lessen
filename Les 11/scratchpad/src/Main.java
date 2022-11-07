public class Main {
    public static void main(String[] args) {
//        Kat k = new Kat();

        // geen argumenten     -> ronde haken verplicht ()
        // 1 argument          -> ronde haken mogelijk (aaa) | aaa ->
        // meerdere argumenten -> ronde haken verplicht (aaa, bbb) ->


        Printable p = System.out::println;
        runnen(p);
    }

    static void runnen(Printable p) {
        p.Print("meow");
    }
}

//class Kat implements Printable {
//    public void Print() {
//        System.out.println("Meow!");
//    }
//}

@FunctionalInterface
interface Printable {
    void Print(String sound);
}