package chapter6_arrays_and_array_lists.sc;


import java.util.ArrayList;

public class Class41 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Bob");
        System.out.println(names);
        names.add(0, "Ann");
        System.out.println(names);
        names.remove(1);
        System.out.println(names);
        names.add("Cal");
        System.out.println(names);

    }

}
