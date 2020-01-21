package chapter15_the_java_collections_framework.pe;

import java.util.Stack;

public class P15_5v2 {
    Stack<Integer> driveway = new Stack<Integer>();
    Stack<Integer> street = new Stack<Integer>();

    public void add(int number){
        driveway.push(number);
    }

    public void remove(int number){
        //if ()
        driveway.pop();
    }

    public void d2s(){
        street.push(driveway.pop());
    }

    public void s2d(){
        driveway.push(street.pop());
    }






    public static void main(String[] args) {
//        Stack<Integer> newStack= new Stack<Integer>();
//        newStack.push(123);
//        newStack.push(789);
//        System.out.println(newStack);
//        System.out.println(newStack.search(1236));
//        System.out.println(newStack.search(123));
//        System.out.println(newStack.search(789));

    }




}
