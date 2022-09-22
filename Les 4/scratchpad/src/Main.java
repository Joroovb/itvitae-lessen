public class Main {
    public static void main(String[] args) {
        int[] getallen = {1, 2, 4, 5, 6};

        for (int index = 0; index < 10; index++) {
            System.out.println(index);
        }

        for (int i = 0; i < getallen.length; i++) {
            System.out.println(getallen[i]);
            if (getallen[i] == 1 ) {
                getallen[i] = 15;
            }
        }

        for (int getal : getallen) {
            System.out.println(getal);
            if (getal == 1) {
                getal = 15;
            }
        }
    }
}