package chapter7_input_output_and_exception_handling.p;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Class7_4 {
    public static void main(String[] args) throws FileNotFoundException {


        File inputFile = new File("F:\\java\\P7_3i.txt");
        Scanner scanner = new Scanner(inputFile);
        int sum1 = 0;
        int sum2 = 0;


        for (int i=1; scanner.hasNextInt(); i++){
            if ((i % 2) == 0){
                sum1 = sum1 + scanner.nextInt();
            }
            else sum2 = sum2 + scanner.nextInt();


        }
        System.out.println(sum2);
        System.out.println(sum1);

    }
}
