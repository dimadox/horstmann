package chapter20_multithreading.pe.P20_2Lock;

import java.util.Stack;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StackPush implements Runnable{
    private Stack stack;
    private Integer incomingNumber;
    private Lock StackPushLock;

    public StackPush(Stack<Integer> stack, Integer incomingNumber){
        this.stack = stack;
        this.incomingNumber = incomingNumber;
        StackPushLock = new ReentrantLock();
    }

    @Override
    public void run() {
        StackPushLock.lock();
        stack.push(incomingNumber);

        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException obj){

        }

        System.out.println("Added " + incomingNumber);
        StackPushLock.unlock();
    }
}
