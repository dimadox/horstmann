package chapter18.pe;

import java.util.ArrayList;

public class P18_20 {
    public static <T> void append (ArrayList<T> a, ArrayList<T> b){
        for (T obj : b){
            a.add(obj);
        }
    }
}
