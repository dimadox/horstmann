package chapter20_multithreading.pe.P20_1v3;

import java.util.ArrayList;

public class ArrayListObject {

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        ArrayListObjectAdd arrayListObjectAdd = new ArrayListObjectAdd(integerArrayList);
        ArrayListObjectRemove arrayListObjectRemove = new ArrayListObjectRemove(integerArrayList);

        Thread thread1 = new Thread(arrayListObjectAdd);
        Thread thread2 = new Thread(arrayListObjectRemove);

        thread1.start();
        thread2.start();





        try{
            thread1.join();
        }
        catch (InterruptedException exception){

        }


        try{
            thread2.join();
        }
        catch (InterruptedException exception){

        }


        //


        System.out.println(integerArrayList);

    }



}
