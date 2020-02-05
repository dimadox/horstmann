package chapter20_multithreading.pe.P20_1v3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListObjectAdd implements Runnable{
    List<Integer> arrayList;


    public ArrayListObjectAdd(List<Integer> arrayList){
        this.arrayList = arrayList;

//        // v1
//        this.arrayList = (ArrayList<Integer>) arrayList.clone();

        // shallow copy (clone())
        // deep copy
//
//        // v2
//        for (Integer q: arrayList){
//            this.arrayList.add(q);
//        }
    }

    @Override
    public void run() {
        for (int i = 0; i != 10000; ++i) {
            arrayList.add(1);
        }
        //System.out.println(arrayList);
    }
}
