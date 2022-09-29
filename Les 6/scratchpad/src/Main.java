import java.awt.dnd.DragGestureListener;

public class Main {
    public static void main(String[] args) {
        Koffie k = new Koffie();
        k.drinken();
        k.vloeien();
        Drinkbaar kk = new Koffie();
        Drinkbaar w = new Water();
        System.out.println(Drinkbaar.liters);
        Meeuw m = new Meeuw();
    }
}

interface Drinkbaar {
   int liters = 100;
   void drinken();
   default void vloeien() {
       System.out.println("Ik vloei over de vloer");
   }
}

abstract class Vogel {
    int aantalPootjes;
    String latijnseNaam;
    abstract void vliegen();
}

class Meeuw extends Vogel {
    void vliegen() {
        
    }
}

class Koffie implements Drinkbaar {
    public void drinken() {
        System.out.println("Lekker koffie drinken");
        System.out.println("Je drinkt " + liters + " liter koffie! Lekker aan het werk!");
    }

    public void vloeien() {
        System.out.println("Koffie op de vloer");
    }
}

class Water implements Drinkbaar {
    public void drinken() {
        System.out.println("Lekker water drinken");
    }
}



