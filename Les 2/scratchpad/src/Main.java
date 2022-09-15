public class Main {

    public static void main(String[] args) {
//        float f = 5.4; // Compileert niet, default is double
        float fff = 5.4f;
        float f = CToF(-40);
        System.out.println("f: " + f);
        float c = FToC(f);
        System.out.println("c: " + c);

    }

    static float FToC(float temp) {
        return (temp - 32) / 1.8f;
    }

    static float CToF(float temp) {
        return temp * 1.8f + 32;
    }
}
