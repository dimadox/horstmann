package chapter18.pe;

import java.util.ArrayList;

public class P18_21 {

    public static <T> ArrayList<T> append (ArrayList<T> a, ArrayList<T> b){
        ArrayList<T> returnArrayList = new ArrayList<T>();
        for (T obj : a){
            returnArrayList.add(obj);
        }

        for (T obj : b){
            returnArrayList.add(obj);
        }

        return returnArrayList;

    }
}
