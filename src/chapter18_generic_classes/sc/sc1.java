package chapter18_generic_classes.sc;

import java.util.LinkedList;

public class sc1 {
    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.addFirst(3.0);
        double x = (Double) a.removeFirst();
        System.out.println(x);



    }
}
