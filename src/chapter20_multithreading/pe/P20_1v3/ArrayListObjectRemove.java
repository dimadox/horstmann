package chapter20_multithreading.pe.P20_1v3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListObjectRemove implements Runnable{
    List<Integer> arrayList;


    public ArrayListObjectRemove(List<Integer> arrayList){
        this.arrayList = arrayList;

    }

    @Override
    public void run() {
        arrayList.remove(0);
        System.out.println(arrayList);
    }
}
