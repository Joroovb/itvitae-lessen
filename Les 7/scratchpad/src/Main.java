import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            zonnen();
        } catch (TeWeinigZonException e) {
            System.out.println("Probleem met zonnen");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Een ander probleem");
            e.printStackTrace();
        } finally {
            System.out.println("Hoe dan ook een mooie dag");
        }
    }

    public static void zonnen() throws TeWeinigZonException {
        boolean genoegZon = false;

        if (!genoegZon) {
            throw new TeWeinigZonException();
        }

        System.out.println("Lekker in het zonnetje liggen");
    }
}

class TeWeinigZonException extends Exception {
    public TeWeinigZonException() {
        super("De zon mag wel weer gaan schijnen");
    }
}

class ThrowExceptions {
    void met1() throws Error {}
    void met2() throws Exception {}
    void met5() throws FileNotFoundException {}

    void met6() {
        try {
             met5();
        }
        catch (FileNotFoundException e) {

        }
    }

    void met3() {
        try { }
        catch (Error e) { }
    }

    void met4() {
        try {

        }
        catch (Exception e) {

        }
    }

}
