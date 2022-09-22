import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Punt a = new Punt(1, 2);
        Punt b = new Punt(1, 2);
        System.out.println(a.equals(b));
    }
}

class Punt {
    int x;
    int y;

    Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Punt punt = (Punt) o;
        return x == punt.x && y == punt.y;
    }
}