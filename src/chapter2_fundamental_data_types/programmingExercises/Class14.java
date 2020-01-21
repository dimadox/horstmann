package chapter2_fundamental_data_types.programmingExercises;
import java.util.Scanner;

public class Class14 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);

        String string;
        string = s.nextLine(); // заносим в строку

        int lengthOfString = string.length(); //считаем длину
        String wholePart = string.substring(0, lengthOfString - 3);
        String fractionPart = string.substring(lengthOfString - 3, lengthOfString);
        System.out.println(wholePart + "," + fractionPart);

    }

}
