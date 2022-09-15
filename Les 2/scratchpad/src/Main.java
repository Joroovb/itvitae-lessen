import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Voer een tekenreeks in: ");
        String invoer = scan.nextLine();
        invoer = invoer.toUpperCase();

        String output = "";
        for (int i = 0; i < invoer.length(); i++) {
            char temp =  (char) (invoer.charAt(i) + 3);
            if (temp > 'Z') {
                temp = (char) (temp - 26);
            }
            output += temp;
        }

        System.out.println(output);
    }
}
