public class Main {


    public static void main(String[] args) {
        max(1, 2.0);
        max(1.0, 2);
//        max(1, 2); // Ambigue
    }

   static int max(int i, double b) {
       System.out.println("Int");
       return 0;
   }

   static double max(double i, int m) {
       System.out.println("Double");
       return 0.0;
   }

   static void max(int i, int m) {
       System.out.println("Ik print iets");
   }

}

