public class Main {
    int voorbeeld = 50;

    public static void main(String[] args) {
       new Main().testmethode();
       Main m = new Main();
        System.out.println(new Main());
        System.out.println(new Main());
    }

    void testmethode() {
//        Main m = new Main();
        int voorbeeld = 60; // shadowing

        if (voorbeeld < 100) {
            voorbeeld = 120;
        }

        System.out.println(voorbeeld);
        System.out.println(this.voorbeeld);
    }

}
