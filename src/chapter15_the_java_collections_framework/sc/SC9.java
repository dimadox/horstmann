package chapter15_the_java_collections_framework.sc;

import java.util.LinkedList;
import java.util.ListIterator;

public class SC9 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Tom");
        names.add("Dima");
        names.add("James");
        names.add("abcdefg");

        ListIterator<String> namesIterator = names.listIterator();

        System.out.println(names);

        //Итератор на 1 вперед
        if (namesIterator.hasNext()){
            namesIterator.next();
        }

        namesIterator.add("new");
        System.out.println(names);
        namesIterator.add("new2");
        System.out.println(names);

        //Итератор на 1 назад
        if (namesIterator.hasPrevious()){
            namesIterator.previous();
        }

        //Итератор до конца назад
        for (int i = 0; i<names.size(); i++ ){
            if (namesIterator.hasNext()){
                namesIterator.next();
            }
        }
        namesIterator.add("Poslednii");

        //Итератор до конца в начало
        for (int i = names.size(); i>=0; i-- ){
            if (namesIterator.hasPrevious()){
                namesIterator.previous();
            }
        }
        namesIterator.add("Pervii");
        System.out.println(names);

        while (namesIterator.hasNext()){
            String name = namesIterator.next();
            if (namesIterator.hasNext()){
                namesIterator.next();
            }
            System.out.print(name + " ");



        }






    }
}
