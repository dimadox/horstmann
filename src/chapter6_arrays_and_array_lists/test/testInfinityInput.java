package chapter6_arrays_and_array_lists.test;

import java.util.Scanner;

public class testInfinityInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int n0 = 1;                               //размер массива
        double[] array = new double[n0];                //объявляем массив с кол-вом элементов n0
        double x = input.nextDouble();                  //в x идеть ввод
        while (x != 0) {                                //пока х не равно 0
            int n = array.length;                       //n = длина массива, нужна для того, чтобы...
            double[] tempArray = new double[n + 1];     //...задать длину врем массива + 1
            for (int i = 0; i < n; i++) {               //в
                tempArray[i] = array[i];
            }
            tempArray[n] = x;
            array = tempArray;
            x = input.nextDouble();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
