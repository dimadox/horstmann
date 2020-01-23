package chapter18_generic_classes.pe;

import java.util.Arrays;

public class P18_22 {

    public static <T> T[] append (T[] a, T[] b){
        T[] returnArray = Arrays.copyOf(a, a.length+b.length);



        return returnArray;

    };
}
