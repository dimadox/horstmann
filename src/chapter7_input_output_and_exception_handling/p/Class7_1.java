package chapter7_input_output_and_exception_handling.p;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Class7_1 {
    public static void main(String[] args) throws  java.io.FileNotFoundException {
        File inputFile = new File("F://java//hello");
        Scanner scanner = new Scanner(inputFile);
        PrintWriter outFile = new PrintWriter("F://java//hello");
        outFile.print("Hello, World!");
        scanner.close();
        outFile.close();

        //We open file again and write to it.
        File inputFile1 = new File("F://java//hello");
        Scanner scanner1 = new Scanner(inputFile);
        while (scanner1.hasNext()){
            System.out.println(scanner1.next());
        }
        scanner.close();
        outFile.close();
    }
}