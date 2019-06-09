package chapter2.programmingExercises;
import java.util.Scanner;

import java.util.Scanner;

public class Class13 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        String string = s.nextLine(); // заносим в строку
        int length = string.length(); //считаем длину

        // [0, n) = n - 0 = n

        // [0, n - 4) = n - 4 - 0 = n - 4
        for (int i=0; i<length-4; i++) {
            System.out.print(string.charAt(i));
        }

        // [n - 3, n) = n - (n - 3) = 3
        for (int i=length-3; i<length; i++) {
            System.out.print(string.charAt(i));
        }

        System.out.println();

        String ans = string.substring(0, length - 4) +
                string.substring(length - 3, length);

        System.out.println(ans);

        //System.out.println(string.charAt(0));
    }

}
