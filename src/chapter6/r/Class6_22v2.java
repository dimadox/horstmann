package chapter6.r;

public class Class6_22v2 {
    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // интерпретация:
        // в array занято только n элементов
        // на позициях [0, n)
        int n = 6;
        int[] array = {2,-3,5,-7,11,-13};

        int j = 0;
        int newn = 0;
        while (j != n) {
            if (array[j] > 0) {
                array[newn] = array[j];
                ++j;
                ++newn;
            } else {
                ++j;
            }
        }

        n = newn;

        printArray(array, n);


        // удаление с конца

        printArray(array, n);

        --n;    // удалил -13

        printArray(array, n);

        --n;    // удалил 11

        printArray(array, n);


        // добавляю в конец

        array[n] = 500;
        n++;

        array[n] = 501;
        n++;

        printArray(array, n);

        // удалить из середины

        int del = 2;
        for (int i = del; i < n - 1;i++){
            array[i] = array[i + 1];
        }

        --n;

        printArray(array, n);

        // добавить в середину

        int ins = 1;
        int val = -33;

        for (int i = n - 1; i >= ins; i--){
            array[i + 1] = array[i];
        }

        ++n;
        array[ins] = val;

        printArray(array, n);

        // 2 -33 -3 -7 500 501
        //    newn
        //              i

        // 2 500 -3 -7 500 501
        //       newn
        //                  i





        int[] correctResult = {2, 5, 11};

        /*
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i<array.length;i++){
            if (array[i] > 0){
                result.add(array[i]);
            }
        }
        */

        // System.out.println(result);



    }
}
