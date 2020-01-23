package chapter18_generic_classes.pe;

import java.util.ArrayList;

public class P18_23v2 {

    public static <T> ArrayList<T> reverse(ArrayList<T> arrayList){
        for (int i = arrayList.size()-1; i >= 0; i--){
            T q = arrayList.get(i);
            arrayList.add(q);
            arrayList.remove(i);
            System.out.println(arrayList);
        }
        return arrayList;
    }

    public static void main(String[] args) {

        ArrayList<Integer> qwe = new ArrayList<>();
        qwe.add(1);
        qwe.add(2);
        qwe.add(3);
        qwe.add(4);
        qwe.add(5);

        System.out.println(reverse(qwe));
    }
}
