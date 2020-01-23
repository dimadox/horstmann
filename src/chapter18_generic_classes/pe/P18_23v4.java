package chapter18_generic_classes.pe;

import java.util.ArrayList;

public class P18_23v4 {

    public static <T> void reverse(ArrayList<T> arrayList){
        int n = arrayList.size();
        for (int i = 0; i != n / 2; ++i){
            T temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(n - 1 - i));
            arrayList.set(n - 1 - i, temp);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> qwe = new ArrayList<>();
        qwe.add(1);
        qwe.add(2);
        qwe.add(3);
        qwe.add(4);
        qwe.add(5);

        reverse(qwe);
        System.out.println(qwe);
    }
}
