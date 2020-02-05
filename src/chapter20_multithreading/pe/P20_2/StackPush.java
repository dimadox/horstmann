package chapter20_multithreading.pe.P20_2;

import java.util.Stack;

public class StackPush implements Runnable{
    private Stack stack;
    private Integer incomingNumber;

    public StackPush(Stack<Integer> stack, Integer incomingNumber){
        this.stack = stack;
        this.incomingNumber = incomingNumber;
    }

    @Override
    public void run() {
        stack.push(incomingNumber);
        System.out.println("Added " + incomingNumber);
    }
}
