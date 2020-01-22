package chapter7_input_output_and_exception_handling.p;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Class7_2v2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Input the file path");
        Scanner inputText = new Scanner(System.in);

        File inputFile = new File(inputText.nextLine());
        Scanner scanner = new Scanner(inputFile);

        int i = 1;
        System.out.println("Input the output file path");
        PrintWriter outputFile = new PrintWriter(inputText.nextLine());

        while (scanner.hasNextLine()){
            outputFile.print("/* " + i + " */ ");
            outputFile.print(scanner.nextLine());
            outputFile.println();
            i++;
        }
        scanner.close();
        outputFile.close();

    }
}
