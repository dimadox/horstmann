package chapter7_input_output_and_exception_handling.p;

import java.util.Scanner;

public class Class7_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int check = 0;

        while (scanner.hasNext()){
            // check = 0;
            if (check>1){
                break;
            }

            if (scanner.hasNextDouble()){
                sum = sum + scanner.nextDouble();
            }
            else {
                System.out.println("Enter the correct number");
                check++;
            }
        }





    }
}
