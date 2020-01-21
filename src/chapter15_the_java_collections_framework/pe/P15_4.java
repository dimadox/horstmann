package chapter15_the_java_collections_framework.pe;

import java.util.Stack;

public class P15_4 {
    public static void main(String[] args) {
        int number = 123456789;
        int bitDepth = String.valueOf(Math.abs(number)).length();
        Stack<Integer> numbers = new Stack<Integer>();

        for (int i = bitDepth; i>0; i--){
            int j = (int) (number/(Math.pow(10, 9-i)) % 10);
            numbers.push(j);
        }

        for (int i = 0; i<bitDepth; i++){
            System.out.println(numbers.pop());
        }

    }
}
