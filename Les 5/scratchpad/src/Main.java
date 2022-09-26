import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String browser = input.nextLine();

        switch(browser) {
            case "Edge":
                System.out.println("Je gebruikt Edge");
                break;
            case "Chrome":
            case "Opera":
            case "Firefox":
                System.out.println("Je gebruikt een moderne browser");
                break;
            case "IE":
                System.out.println("Internet Explorer??");
                break;
            default:
                System.out.println("Je gebruikt een niet ondersteunde browser");
        }


    }
}
