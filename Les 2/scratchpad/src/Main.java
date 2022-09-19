import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean positief = false;
        int getal;

        while(!positief) {
            getal = input.nextInt();
            if (getal <= 0) {
                System.out.println("Voer een positief getal in");
                continue;
            }
            positief = true;
        }

    }
}
