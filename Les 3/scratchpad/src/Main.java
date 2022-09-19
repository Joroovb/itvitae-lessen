public class Main {


    public static void main(String[] args) {
        Test t = new Test();
        t.method1(5);
    }

}
class Test {
    static int x = 11;
    static private int y = 33;

    public void method1(int x) {
        Test t = new Test();
        this.x = 22;
        y = 44;

        System.out.println(Test.x);
        System.out.println(t.x);
        System.out.println(t.y);
        System.out.println(y);
    }
}