package Lektion4.Vector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vector> l = new ArrayList<>();
        l.add(new Vector(1.0, 2.0));
        l.add(new Vector(2.0, 3.0));
        l.add(new Vector(3.0, 4.0));
        l.add(new Vector(0.1,0.2));

        Collections.sort(l);
        System.out.println(l.toString());
    }
}
