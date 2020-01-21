package chapter15_the_java_collections_framework.pe;

import java.util.ListIterator;
import java.util.LinkedList;

//Тут просто третий

public class P15_1 {
    public static void downsize (LinkedList<String> employeeNames, int i){
        ListIterator<String> employeeNamesIterator = employeeNames.listIterator();
        for (int j = 0; j<i; j++){
            if (employeeNamesIterator.hasNext()){
                employeeNamesIterator.next();
            }
        }
        employeeNamesIterator.remove();
    }




    public static void main(String[] args) {
        int i=3;
        LinkedList<String> employeeNames = new LinkedList();
        employeeNames.add("Tom1");
        employeeNames.add("Tom2");
        employeeNames.add("Tom3");
        employeeNames.add("Tom4");
        employeeNames.add("Tom5");
        employeeNames.add("Tom6");
        employeeNames.add("Tom7");
        employeeNames.add("Tom8");


        downsize(employeeNames, i);
        System.out.println(employeeNames);
    }
}
