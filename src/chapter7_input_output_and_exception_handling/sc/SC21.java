package chapter7_input_output_and_exception_handling.sc;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SC21 {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "F://java//input";
        int lines[] = {1, 2, 3};

        PrintWriter out = new PrintWriter(filename);
        for (int line : lines) {

            out.close();
        }
    }
}
