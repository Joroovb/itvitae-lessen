import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String browser = input.nextLine().toLowerCase();

        switch(browser) {
            case "edge":
                System.out.println("Je gebruikt Edge");
                break;
            case "chrome":
            case "opera":
            case "firefox":
                System.out.println("Je gebruikt een moderne browser");
                break;
            case "internet explorer":
            case "ie":
                System.out.println("Internet Explorer??");
                break;
            default:
                System.out.println("Je gebruikt een niet ondersteunde browser");
        }


    }
}
