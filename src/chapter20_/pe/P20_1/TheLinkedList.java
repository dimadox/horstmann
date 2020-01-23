package chapter20_.pe.P20_1;

import java.util.LinkedList;

public class TheLinkedList <T>  {
    LinkedList<T> linkedList;

    public <T extends Number> TheLinkedList(LinkedList<T> linkedList){

    }

    public void linkedlistadd(T element){
        linkedList.add(element);
    }

    public void linkedlistremove(){
        linkedList.removeFirst();
    }




}
