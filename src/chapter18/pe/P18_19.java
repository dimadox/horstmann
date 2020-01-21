package chapter18.pe;

import java.util.ArrayList;

public class P18_19 <T>{

    public static <K> void append (ArrayList<K> a, ArrayList<K> b){
        for (K obj : b){
            a.add(obj);
        }
    }

    public T qwe(){
        return null;
    }
}
