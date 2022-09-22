import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Geef een string op: ");
        String input = in.nextLine();
        String output = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }

        String naam = "Joris";
        naam.toLowerCase(); // veranderd origineel niet
        System.out.println(naam);

        String naam2 = "Joris";
        naam2 = naam2.toLowerCase();
        System.out.println(naam2);

        System.out.println(output);

        if (input.equalsIgnoreCase(output)) {
            System.out.println("Palindrome");
        }

        String tekst = "Hallo; Hallo;";
        String tekst2 = "Hallo;";

        String tekst3 = "Hallo; Hallo;";



        if (tekst3 == tekst) {
            System.out.println("Gelijk");
        } else {
            System.out.println("Niet gelijk");
        }
    }
}
