package chapter18_generic_classes.pe;

import chapter18_generic_classes.sc.Pair;

public class P18_6 {
    public static <T extends java.lang.Comparable<T>> Pair minmax(T[] array){

        T min = array[0];
        T max = array[0];
        if (array.length > 1){
            for (int i = 1; i < array.length; i++){
                if (array[i].compareTo(min) < 0){
                    min = array[i];
                }
                if (array[i].compareTo(max) > 0){
                    max = array[i];
                }
            }
        }
        else System.out.println("Error");
        return new Pair(min, max);

    }

    public static void main(String[] args) {
        String[] array = {"abc", "zxc", "ab","qwe","zxc 152125123414411"};
        Integer[] arr2 = {1, 5, -10, -30};
        System.out.println(minmax(array));
        System.out.println(minmax(arr2));
    }

}
