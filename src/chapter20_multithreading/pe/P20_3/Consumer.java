package chapter20_multithreading.pe.P20_3;

import java.util.Date;
import java.util.Queue;

public class Consumer implements Runnable {
    Queue<String> queue;

    Consumer(Queue<String> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i=0; i<100; i++){
            if (!queue.isEmpty()){
                System.out.println(queue.element());
                queue.remove();
            }
        }
    }
}
