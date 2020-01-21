package chapter15_the_java_collections_framework.pe;

import java.util.Stack;

public class P15_4v2 {
    public static void main(String[] args) {
        int number = 123456789;
        int bitDepth = String.valueOf(Math.abs(number)).length();
        Stack<Integer> numbers = new Stack<Integer>();
        for (int i = bitDepth; i>0; i--){
            numbers.push((int) ((number/Math.pow(10, i-1))%10));

        }

        System.out.println(numbers);

    }
}
