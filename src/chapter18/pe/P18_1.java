package chapter18.pe;

import chapter18.sc.Pair;

public class P18_1 <T, S> extends Pair {
    public P18_1(T firstElement, S secondElement){
        // super(firstElement, secondElement);
    }

    public static void main(String[] args) {
        P18_1<Integer, String> x = new P18_1<Integer, String>(10, "Hello");
        System.out.println(x);
    }

}
