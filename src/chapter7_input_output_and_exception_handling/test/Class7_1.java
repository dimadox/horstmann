package chapter7_input_output_and_exception_handling.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Class7_1 {
    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("F:\\java\\input.txt");
        Scanner in = new Scanner(inputFile);
        int i = in.nextInt();
        //System.out.print(i);
        i = 123;
        PrintWriter out = new PrintWriter("output.txt");
        out.print(i);

        in.close();
        out.close();


    }
}