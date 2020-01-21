package chapter18.pe;

import java.util.ArrayList;

public class P18_24 {
    public static <T> ArrayList <T> reverse(ArrayList<T> arrayList){
        ArrayList<T> returnArrayList = new ArrayList<>();
        for (int i = arrayList.size()-1; i >= 0; i--){
            returnArrayList.add(arrayList.get(i));
        }
        return returnArrayList;
    }

    public static void main(String[] args) {

        ArrayList<Integer> qwe = new ArrayList<>();
        qwe.add(1);
        qwe.add(2);
        qwe.add(3);
        qwe.add(4);
        qwe.add(5);




        System.out.println(reverse(qwe));
        System.out.println(qwe);
    }
}
