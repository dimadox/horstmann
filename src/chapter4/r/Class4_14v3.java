package chapter4.r;
import java.util.Scanner;

public class Class4_14v3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = 0;
        double result = 0;
        int quantity = 0;
        while (value != -1);
        {
            value = in.nextInt();
            result = result + value;
            quantity = quantity + 1;
        }

        System.out.println(result/quantity);

    }
}
