package chapter20_multithreading.pe.P20_2Lock;

import java.util.Stack;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StackIsEmpty implements Runnable{
    private Stack stack;
    private Lock StackIsEmptyLock;

    public StackIsEmpty(Stack<Integer> stack){
        this.stack = stack;
        StackIsEmptyLock = new ReentrantLock();
    }

    @Override
    public void run() {
        StackIsEmptyLock.lock();


        if (stack.isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Stack is not empty");
        }

        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException obj){

        }

        StackIsEmptyLock.unlock();

    }
}
