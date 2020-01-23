package chapter6_arrays_and_array_lists.r;

import java.util.ArrayList;

public class Class6_23 {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,4,4,5,5,6,7,8,8};
        int number = 5;
        ArrayList<Integer> result = new ArrayList<Integer>();
        boolean indikator = true;


        for (int i=0; i<array.length;i++){
            result.add(array[i]);

            if ((array[i] == number)&& indikator){      //пришлось добавлять индикатор, а то вставляется 2 раза
                result.add(i, array[i]);
                indikator = false;

            }

        }

        System.out.print(result);





    }
}
