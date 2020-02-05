package chapter20_multithreading.pe.P20_1v3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListObjectv2 {

    public static void main(String[] args) {
        //List<Integer> integerArrayList = new ArrayList<>();
        List<Integer> integerArrayList = Collections.synchronizedList(new ArrayList<>());

        ArrayListObjectAdd arrayListObjectAdd = new ArrayListObjectAdd(integerArrayList);
        //ArrayListObjectRemove arrayListObjectRemove = new ArrayListObjectRemove(integerArrayList);



        ArrayList<Thread> ListThreads = new ArrayList<>();
        for (int i=0; i<10; i++){
            ListThreads.add(new Thread(arrayListObjectAdd));
            //ListThreads.add(new Thread(arrayListObjectRemove));
        }

        for (Thread thread : ListThreads) {
            thread.start();

        }




        try{
            for (Thread thread : ListThreads) {
                thread.join();

            }
        }
        catch (InterruptedException exception){

        }


        System.out.println("ArrayList is " + integerArrayList.size());



        //




    }



}
