package chapter6.test;
import java.util.Scanner;

public class testInput2 {
    public static void main(String[] args) {
        int currentSize = 0;
        Scanner input = new Scanner(System.in);
        double[] array = new double[5];
        for (int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
