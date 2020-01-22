package chapter7_input_output_and_exception_handling.p;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Class7_6 {
    public static void main(String[] args) throws FileNotFoundException {
        String findWord = args[0];
        for (int i=1; i<args.length; i++){
            File inputFile = new File(args[i]);
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNextLine()){

            }


        }



    }
}
