import java.awt.dnd.DragGestureListener;

public class Main {
    public static void main(String[] args) {
        Meeuw m = new Meeuw();
        m.vliegen();
        m.naam = "ja";
        Vogel v = m;
//        v.naam = "nee";
        v.vliegen();
        Meeuw mm = (Meeuw) v;
        mm.naam = "Ja";
        mm.vliegen();
    }
}


 class Vogel {
    void vliegen() {
        System.out.println("vogels kunnen vliegen");
    }
}

class Meeuw extends Vogel {
    String naam = "";
    void vliegen() {
        System.out.println("Meeuwen ook");
    }
}



