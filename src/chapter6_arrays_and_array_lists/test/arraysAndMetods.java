package chapter6_arrays_and_array_lists.test;

import java.util.Arrays;

public class arraysAndMetods {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(Arrays.toString(arrayDouble(array)));

    }

    public static int[] arrayDouble (int[] tempArray) {
        int[] array = new int[tempArray.length];
        for (int i=0; i<tempArray.length; i++){
            array[i] = tempArray[i]*2;
        }
        return array;

    }
}
