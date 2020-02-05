package chapter20_multithreading.pe.P20_3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRun {
    public static void main(String[] args) {
        Queue<String> queueString = new LinkedList<>();

        Producer producer = new Producer(queueString);
        Consumer consumer = new Consumer(queueString);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();

    }



}
