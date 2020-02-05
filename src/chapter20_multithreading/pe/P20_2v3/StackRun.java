package chapter20_multithreading.pe.P20_2v3;

import java.util.LinkedList;
import java.util.Stack;

public class StackRun {
    public static void main(String[] args) {
        MyStack<Integer> testStack = new MyStack<>();

        int pusherThreads = 2;
        int n = 1000;

        LinkedList<Thread> stackPush = new LinkedList<>();

        for (int i = 0; i != pusherThreads; ++i)
            stackPush.add(new Thread(new StackPush(testStack, n)));

        StackPop stackPop = new StackPop(testStack, n * pusherThreads);

        Thread t3 = new Thread(stackPop);

        for (Thread t: stackPush)
            t.start();

        try {
            for (Thread t: stackPush)
                t.join();
        }
        catch (InterruptedException e){

        }

        // 3

        System.out.println(testStack.size());


        t3.start();


    }
}
