package chapter6.r;

import java.util.ArrayList;

public class Class6_22 {
    public static void main(String[] args) {
        int[] array = {2,-3,5,-7,11,-13};
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i<array.length;i++){
            if (array[i] > 0){
                result.add(array[i]);
            }
        }
        System.out.println(result);



    }
}
