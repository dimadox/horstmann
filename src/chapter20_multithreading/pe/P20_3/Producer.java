package chapter20_multithreading.pe.P20_3;

import java.util.Date;
import java.util.Queue;

public class Producer implements Runnable {
    Queue<String> queue;

    Producer(Queue<String> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i=0; i<100; i++){
            if (queue.size()<10){
                queue.add(new Date().toString());
                System.out.println(queue.element());
            }
        }



    }



}
