package chapter7_input_output_and_exception_handling.sc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("F://java//inpu1t.txt");
        Scanner scanner = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("F://java//output.txt");
        int total = scanner.nextInt();
        out.print(total);

        scanner.close();
        out.close();

    }
/*
    public static void f1() {
        main(null);

    }
    */
}
