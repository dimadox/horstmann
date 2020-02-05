package chapter20_multithreading.pe.P20_2v2;

import java.util.Stack;

public class StackPush implements Runnable {
    private Stack stack;
    private Integer incomingNumber;

    public StackPush(Stack<Integer> stack, Integer incomingNumber){
        this.stack = stack;
        this.incomingNumber = incomingNumber;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            stack.push(incomingNumber);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException obj){

            }
            System.out.println("Added " + incomingNumber);
        }

    }
}
