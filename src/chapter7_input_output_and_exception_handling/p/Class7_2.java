package chapter7_input_output_and_exception_handling.p;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Class7_2 {
    public static void main(String[] args) throws FileNotFoundException {



        File inputFile = new File("F://java//P7_2input.txt");
        Scanner scanner = new Scanner(inputFile);

        int i = 1;

        PrintWriter outputFile = new PrintWriter("F://java//P7_2output.txt");

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
