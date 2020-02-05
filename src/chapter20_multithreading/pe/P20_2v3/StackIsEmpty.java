package chapter20_multithreading.pe.P20_2v3;

public class StackIsEmpty implements Runnable{
    private MyStack<Integer> stack;

    public StackIsEmpty(MyStack<Integer> stack){
        this.stack = stack;
    }

    @Override
    public void run() {
        if (stack.isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Stack is not empty");
        }

    }
}
