package chapter20_multithreading.pe.P20_2v2;

import java.util.Stack;

public class StackRun {
    public static void main(String[] args) {
        Stack<Integer> testStack = new Stack<>();

        StackPush stackPush = new StackPush(testStack, 15);
        StackPop stackPop = new StackPop(testStack);
        StackIsEmpty stackIsEmpty = new StackIsEmpty(testStack);

        Thread t1 = new Thread(stackPush);
        Thread t2 = new Thread(stackPop);
        Thread t3 = new Thread(stackIsEmpty);

        t1.start();
        t2.start();
        t3.start();






    }
}
