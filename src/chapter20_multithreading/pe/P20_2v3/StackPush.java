package chapter20_multithreading.pe.P20_2v3;

import java.util.Stack;

public class StackPush implements Runnable{
    private MyStack stack;
    int n;


    public StackPush(MyStack<Integer> stack, int n){
        this.stack = stack;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i<n; i++){
            stack.push(0);
            // System.out.println("Added " + n);
        }
    }
}
