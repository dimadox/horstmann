package chapter7_input_output_and_exception_handling.p;

import java.util.Scanner;

public class Class7_13v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        try{
            while (scanner.hasNext()){
                sum = sum + scanner.nextDouble();
            }
        }
        catch (Exception exception){
            System.err.println("Enter the correct number");
        }

        finally {
            System.out.println(sum);
        }







    }
}
