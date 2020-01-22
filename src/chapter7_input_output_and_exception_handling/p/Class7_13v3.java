package chapter7_input_output_and_exception_handling.p;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Class7_13v3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;


        // считать всё и просуммировать введённое корректно
        try{
            while (scanner.hasNext()){
                try {
                    sum = sum + scanner.nextDouble();
                } catch (InputMismatchException ex){
                    System.out.println(ex);
                    scanner.nextLine();
                    System.out.println("please, try once again: ");
                    sum = sum + scanner.nextDouble();
                }
            }
        }
        catch (Exception exception){
            // System.err.println("Enter the correct number");
            System.out.println("thank you for collaboration");
        }


        System.out.println(sum);
    }
}
