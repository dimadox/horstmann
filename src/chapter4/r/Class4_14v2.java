package chapter4.r;
import java.util.Scanner;

public class Class4_14v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value;
        double result = 0;
        int quantity = 0;
        do
        {
            value = in.nextInt();
            result = result + value;
            quantity = quantity + 1;
        }
        while (value != -1);
        System.out.println((result+1)/(quantity-1));

    }
}
