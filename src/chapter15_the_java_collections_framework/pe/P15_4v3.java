package chapter15_the_java_collections_framework.pe;

import java.util.Stack;

public class P15_4v3 {
    public static void main(String[] args) {
        int number = 123456789;
        Stack<Integer> numbers = new Stack<Integer>();
        while (number != 0) {
            numbers.push(number % 10);
            number /= 10;
        }

        while (!numbers.isEmpty()){
            System.out.print(numbers.pop() + " ");
        }

    }
}
