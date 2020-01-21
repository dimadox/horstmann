package chapter2_fundamental_data_types.programmingExercises;
import java.util.Scanner;

public class Class16 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        String string = s.nextLine(); // заносим в строку
        int lengthOfString = string.length(); //считаем длину
        for (int i=0; i<lengthOfString; i++) {
            String part = string.substring(i, i+1);
            System.out.print(" " + part);
        }
    }

}
