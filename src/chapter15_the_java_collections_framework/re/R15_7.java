package chapter15_the_java_collections_framework.re;

import java.util.LinkedList;
import java.util.ListIterator;


public class R15_7 {
    public static void main(String[] args) {

        LinkedList<String> staff = new LinkedList<String>();

        ListIterator<String> iterator = staff.listIterator();
        iterator.add("Tom");
        iterator.add("Diana");
        iterator.add("Harry");
        iterator = staff.listIterator();
        if (iterator.next().equals("Tom")) { iterator.remove(); }
        while (iterator.hasNext()) { System.out.println(iterator.next()); }
    }
}
