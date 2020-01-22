package chapter7_input_output_and_exception_handling.p;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Class7_8 {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("F://java//P78.txt");
        Scanner scanner = new Scanner(input);
        String s = "";
        while (scanner.hasNext()){
            s = scanner.nextLine();
            for (int i = 0; i<s.length()-1; i++){
                System.out.print(s.substring(s.length()-1-i, s.length()-i));
            }
            System.out.println(s.substring(0, 1));

        }
    }
}
