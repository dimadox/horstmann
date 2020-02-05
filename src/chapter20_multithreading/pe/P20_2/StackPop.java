package chapter20_multithreading.pe.P20_2;

import java.util.Stack;

public class StackPop implements Runnable{
    private Stack stack;

    public StackPop(Stack<Integer> stack){
        this.stack = stack;
    }

    @Override
    public void run() {
        System.out.println("Deleted the last element " + stack.peek());
        stack.pop();
    }
}
