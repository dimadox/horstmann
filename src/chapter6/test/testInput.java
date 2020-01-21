package chapter6.test;
import java.util.Scanner;

public class testInput {
    public static void main(String[] args) {
        int currentSize = 0;
        Scanner input = new Scanner(System.in);
        double[] array = new double[5];
        while (input.hasNextDouble()){
            if (currentSize < array.length){
                array[currentSize] = input.nextDouble();
                currentSize++;
            }
            else break;
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
