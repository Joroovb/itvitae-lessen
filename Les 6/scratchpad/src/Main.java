import java.awt.dnd.DragGestureListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> getallen = new ArrayList<>();
        getallen.add(5);
        getallen.add(3);
        getallen.add(1);
        getallen.add(10);
        getallen.add(11);

        getallen.forEach(num -> System.out.println(num));
        getallen.stream().filter(num -> num > 3);


        for (Integer n : getallen) {
            System.out.println(n);
        }

    }
}
