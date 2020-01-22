package chapter7_input_output_and_exception_handling.test;

import java.io.File;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        int i = 0;

        // LISKOV substitution:
        // Creature -> Mammal -> Ape
        //                    -> Elephants
        // Ape a = new Ape();

        // java.lang.Exception -> ... -> ArithmeticException
        // java.lang.Exception -> ... -> FileNotFoundException
        // ArithemicException ae = new ArithmeticException();

        try {
            double j = 10/i;
            File input = new File("F://1.txt");
            Scanner scanner = new Scanner(input);
        } catch (java.io.FileNotFoundException ex) {
            System.out.println("fnf exception caught");
        }

        /*
        catch (java.lang.Exception ex) {
            System.out.println("generic exception caught");
        }
        */


    }
}
