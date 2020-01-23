package chapter6_arrays_and_array_lists.test;
import java.util.Scanner;

public class testSum {
    public static void main(String[] args) {
        int currentSize = 0;
        Scanner input = new Scanner(System.in);
        double[] array = new double[3];
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }
        for (double i:array){
            sum = sum + i;
        }




        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println(sum);

    }
}
