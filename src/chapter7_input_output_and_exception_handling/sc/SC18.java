package chapter7_input_output_and_exception_handling.sc;


import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SC18 {
    public static void main(String[] args) {
        try
        {

            Scanner in = new Scanner(new File("F://java//sc18"));
            int value = in.nextInt();
            System.out.println(value);
        }
        catch (IOException | NoSuchElementException exception)
        {
            System.out.println("Error opening file.");
        }
    }
}
