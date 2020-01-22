package chapter7_input_output_and_exception_handling.sc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Class3 {
    public static void main(String[] args) throws FileNotFoundException{

        File inputFile = new File("F://java//input.txt");
        Scanner scanner = new Scanner(inputFile);

        int total = scanner.nextInt()*2;

//        String path = "F://java//input.txt";
//        PrintWriter out = new PrintWriter(path);

        PrintWriter out = new PrintWriter("F://java//input.txt");



        out.print(total);

        System.out.println(scanner.hasNext());


        scanner.close();
        out.close();

    }
}