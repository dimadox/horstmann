package chapter20_multithreading.pe.P20_2v2;

import java.util.Stack;

public class StackIsEmpty implements Runnable{
    private Stack stack;

    public StackIsEmpty(Stack<Integer> stack){
        this.stack = stack;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){
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
        }


    }
}
