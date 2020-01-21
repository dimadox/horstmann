package chapter18.pe;

import java.util.ArrayList;

public class P18_23 {

    public static <T> ArrayList<T> reverse(ArrayList<T> arrayList){
        int y = arrayList.size();
        for (int i = 0; i < y; i++){
            T q = arrayList.get(i);
            arrayList.add(q);
            arrayList.remove(i);
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
        System.out.println(qwe);
        System.out.println(reverse(qwe));
    }
}
