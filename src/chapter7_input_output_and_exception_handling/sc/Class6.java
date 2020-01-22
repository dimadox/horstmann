package chapter7_input_output_and_exception_handling.sc;

import java.util.Scanner;

public class Class6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = 0;
        double x2 = 0;
        while (in.hasNext()){
            x1 = in.nextDouble();
            x2 = in.nextDouble();
        }

        System.out.println(x1);
        System.out.println(x2);



    }
}
