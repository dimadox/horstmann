package chapter15_the_java_collections_framework.re;

import java.util.LinkedList;

public class R15_4 {
    public static void main(String[] args) {
        LinkedList<String> staff = new LinkedList<String>();
        staff.addFirst("Harry");
        System.out.println(staff);
        staff.addFirst("Diana");
        System.out.println(staff);
        staff.addFirst("Tom");
        System.out.println(staff);
        System.out.println(staff.removeFirst());

        System.out.println(staff.removeFirst());

        System.out.println(staff.removeFirst());
        System.out.println(staff);
    }

}
