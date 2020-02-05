package chapter20_multithreading.pe.P20_2v3;

import java.util.Stack;

public class StackPop implements Runnable{
    private MyStack stack;
    int n;

    public StackPop(MyStack<Integer> stack, int n){
        this.stack = stack;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i<n; i++){
            // System.out.println("Deleted the last element");
            stack.pop();
        }

    }
}
