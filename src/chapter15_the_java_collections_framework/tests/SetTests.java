package chapter15_the_java_collections_framework.tests;

import java.util.HashSet;
import java.util.LinkedList;

public class SetTests {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("Tom5");
        names.add("Tom2");
        names.add("***");
        names.add("99");
        names.add("Alan");
        names.remove("Aw");
        for (String name : names){
            System.out.println(name);
        }

        LinkedList a = new LinkedList();




    }
}
