package chapter20_multithreading.pe.P20_2v2;

import java.util.Stack;

public class StackPop implements Runnable{
    private Stack stack;

    public StackPop(Stack<Integer> stack){
        this.stack = stack;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println("Deleted the last element " + stack.peek());
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException obj){

            }
            stack.pop();
        }

    }
}
