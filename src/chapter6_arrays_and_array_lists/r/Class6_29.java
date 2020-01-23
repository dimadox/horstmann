package chapter6_arrays_and_array_lists.r;

import java.util.ArrayList;
import java.util.Arrays;

public class Class6_29 {
    public static void main(String[] args) {
        int[] array = {5,3,1,4,6,3,8,1,67};
        int counter = 0;
        ArrayList<Integer>result = new ArrayList<Integer>();

        Arrays.sort(array, 0, array.length); //Сортировка массива

        for (int i =0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }

        for (int i =0; i<(array.length-1); i++){
            if (array[i] == array[i+1]){
                counter++;

            }
            else {
                result.add(counter);
                counter = 0;
            }

        }


        System.out.print(result);


    }
}
