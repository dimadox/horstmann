package chapter18_generic_classes.pe;

import chapter18_generic_classes.sc.Pair;

public class P18_2v3 {

    public static <T> Pair swap (Pair<T,T> pair){
        T first = pair.getFirst();
        T second = pair.getSecond();
        return new Pair<T, T>(second, first);



    }

    public static void main(String[] args) {
        Pair<Integer, Integer> test = new Pair<>(1, 2);
        System.out.println(swap(test));

    }
}
