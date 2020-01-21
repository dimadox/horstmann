package chapter4_loops.r;
import java.util.Scanner;

public class Class4_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value;
        double result = 0;
        do
        {
            value = in.nextInt();
            result = result + value;
        }
        while (value != -1);
        System.out.println(result);

    }
}
