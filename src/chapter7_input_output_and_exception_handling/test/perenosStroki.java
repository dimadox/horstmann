package chapter7_input_output_and_exception_handling.test;

import java.io.File;
import java.util.Scanner;

public class perenosStroki {
    public static void main(String[] args) throws java.io.FileNotFoundException {
        File inputFile = new File("F://java//input.txt");
        Scanner scanner = new Scanner(inputFile);

        while (scanner.hasNextInt()){
//            int i = scanner.nextInt();
            System.out.println(scanner.nextInt());
        }
        scanner.close();




    }
}
