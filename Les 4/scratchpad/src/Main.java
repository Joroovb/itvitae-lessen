public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Bon");
        sb.insert(2, 'r');
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("123");
        char[] naam = {'J', 'a', 'v', 'a'};
        sb1.insert(2, naam, 1, 3);
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Joris");
        sb2.delete(1, 3); // exclusief end index
        System.out.println(sb2);
    }
}
