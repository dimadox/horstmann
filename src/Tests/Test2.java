package Tests;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        double total = 0;
        int count = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble())
        {
            double input = in.nextDouble();
            if (input == 0) break;
            total = total + input;
            count++;
            System.out.println(total);

        }
    }
}
