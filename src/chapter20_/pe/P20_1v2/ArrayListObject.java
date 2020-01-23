package chapter20_.pe.P20_1v2;

import java.util.ArrayList;

public class ArrayListObject <T extends Number> {
    ArrayList<T> arrayList;

    public ArrayListObject(ArrayList<T> array){
        for (T obj:array){
            arrayList.add(obj);
        }
    }

    public void ArrayListAdd(T element){
        arrayList.add(element);
    }

    public void ArrayListRemove(){
        if (!arrayList.isEmpty()){
            arrayList.remove(0);
        }
    }
}
