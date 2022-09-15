import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Voer het aantal meters in: ");
        int afstand = scan.nextInt();
        System.out.print("Voer het aantal uren in: ");
        int uren = scan.nextInt();
        System.out.print("Voer het aantal minuten in: ");
        int minuten = scan.nextInt();
        System.out.print("Voer het aantal seconden in: ");
        int seconden = scan.nextInt();

        minuten = minuten + urenNaarMin(uren);
        seconden = seconden + minNaarSec(minuten);
        float mps = meterPerSeconde(afstand, seconden);
        float kpu = kmPerUur(mps);
        float mpu = mijlPerUur(kpu);
        System.out.println("Uw snelheid in m/s: " + mps);
        System.out.println("Uw snelheid in km/u: " + kpu);
        System.out.println("Uw snelheid in m/u: " + mpu);


    }

    static short urenNaarMin(int uren) {
        return (short) (uren * 60);
    }

    static int minNaarSec(int min) {
        return min * 60;
    }

    static float meterPerSeconde(int meter, int seconden) {
        return (float) meter / seconden;
    }

    static float kmPerUur(float mps) {
        return mps * 3.6f;
    }

    static float mijlPerUur(float kpu) {
        return kpu / 1.609f;
    }
}
