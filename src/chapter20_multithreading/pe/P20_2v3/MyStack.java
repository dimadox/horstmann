package chapter20_multithreading.pe.P20_2v3;

import java.util.LinkedList;


// defensive programming

public class MyStack <T>{
    LinkedList<T> linkedList = new LinkedList<>();

    public void push(T inputObject){
        linkedList.add(inputObject);
    }

    public T pop(){
        T value = linkedList.removeLast();
        return value;
    }

    public boolean isEmpty(){
        return linkedList.isEmpty();
    }

    public int size(){
        return linkedList.size();
    }
}
