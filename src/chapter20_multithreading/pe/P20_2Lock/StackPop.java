package chapter20_multithreading.pe.P20_2Lock;

import java.util.Stack;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StackPop implements Runnable{
    private Stack stack;
    private Lock StackPopLock;

    public StackPop(Stack<Integer> stack){
        this.stack = stack;
        StackPopLock = new ReentrantLock();
    }

    @Override
    public void run() {
        StackPopLock.lock();
        System.out.println("Deleted the last element " + stack.peek());

        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException obj){

        }

        stack.pop();
        StackPopLock.unlock();
    }
}
