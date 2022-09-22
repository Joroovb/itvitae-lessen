public class Main {
    public static void main(String[] args) {
        String naam = "\t        Joris          \n";
        System.out.println(naam.trim());

        String letters = "ABCAB";
        System.out.println(letters.replace("CA", "12"));
        System.out.println("".length());
        System.out.println(letters.startsWith("A", 3)); // begin met checken vanaf index 3
//        String naam2 = "KLaas";
//        char letter = naam.charAt(2);
//
//        System.out.println(letter);
//
//        String naamStuk = naam2.substring(2, 5);
//        String naamStuk2 = naam2.substring(2, naam2.length());
//        String naamStuk3 = naam2.substring(2); // komt op hetzelfde neer als erboven
//        System.out.println(naamStuk3);
//
//        System.out.println(naamStuk);
//        int i = naam2.indexOf('a');
//
//        System.out.println(i);
//
//        int length = naam.length();
//        System.out.println(letter);
//        System.out.println(length);

    }
}
