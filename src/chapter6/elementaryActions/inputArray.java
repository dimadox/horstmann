package chapter6.elementaryActions;
import java.util.Scanner;

public class inputArray {
   public static void main(String[] args) {
//       метод принмает кол-во элементов, а возвращает массив
    }
    public static int[] inputArray(int arrayLength){
       int[] array = new int[arrayLength];
       Scanner in = new Scanner(System.in);
       for (int i=0; i<array.length; i++){
           array[i] = in.nextInt();
       }
       return array;
    }
}
