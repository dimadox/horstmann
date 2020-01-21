package chapter6.r;

import java.util.ArrayList;

public class Class6_24 {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 5, 3, 1, 2, 4, 3, 2, 2, 2, 2, 3, 6, 5, 5, 6, 3, 1};
        int[] matrix = new int[array.length];
        int length = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        int theLargest = 0;

        for (int i = 0; i<(array.length-1); i++){
            if (array[i] == array[i+1]){
                matrix[i] = array [i];
                matrix[i+1] = array [i];
            }
            else {
                //matrix[i] = 0;
                matrix[i+1] = 0;
            }
        }
        for (int i =0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i =0; i<matrix.length; i++){
            System.out.print(matrix[i] + " ");
        }
        //System.out.println();


        for (int i = 0; i<(array.length); i++){
            if (matrix[i] != 0){
                length++;

            }
            else {
                //System.out.print(length + " ");
                result.add(length);
                length = 0;
            }
        }
        System.out.println();
        System.out.print(result);

        for (int i = 0; i<result.size(); i++){
            if (result.get(i)>theLargest){
                theLargest = result.get(i);
            }
        }
        System.out.println();
        System.out.print(theLargest);






    }
}
