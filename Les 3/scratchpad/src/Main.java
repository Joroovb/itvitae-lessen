public class Main {


    public static void main(String[] args) {
        System.out.println(exponent(3, 3));
        System.out.println(exponent2(3, 3));
        System.out.println(exponent3(3, 3));
        System.out.println(OddEvenTest.isOdd(4));
        System.out.println(OddEvenTest.isOdd2(4));
        System.out.println(OddEvenTest.isOdd3(4));
    }

    public static int exponent(int base, int exp) {
        if (exp >= 0) {
            int result = 1;
            for (int i = 0; i < exp; i++) {
                result *= base;
            }
            return result;
        } else {
            return 0;
        }
    }

    public static int exponent2(int base, int exp) {
        return (int) Math.pow(base, exp);
    }

    public static int exponent3(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else if (exp < 0) {
            return base / exponent3(base, exp + 1);
        } else {
            return base * exponent3(base, exp - 1);
        }
    }
}

class OddEvenTest {
    static boolean isOdd(int invoer) {
        if (invoer % 2 != 0) {
            return true;
        }
        return false;
    }

    static boolean isOdd2(int invoer) {
        return invoer % 2 != 0;
    }

    static boolean isOdd3(int invoer) {
        if (((invoer & 1)) == 0) {
            return false;
        }
        return true;
    }
}