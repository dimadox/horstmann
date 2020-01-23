package chapter6_arrays_and_array_lists.p;

import java.util.Arrays;

public class Class6_11_with_ArraysSort {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 1, 2, 6, 7};
        int[] array2 = {1, 2, 6, 7, 1, 2, 3};
        boolean check = true;
        Arrays.sort(array1, 0, array1.length);
        Arrays.sort(array2, 0, array1.length);
        for (int i = 0; i<array1.length; i++){
            if(array1[i] != array2[i]){
                check = false;

            }

        }
        if(check){
            System.out.println("The arrays are equals");
        }
        else System.out.println("The arrays are not equals");


    }




}
