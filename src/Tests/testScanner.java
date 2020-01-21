package Tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testScanner {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("F://java//P78.txt");
        Scanner scanner = new Scanner(input);


        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }


        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}
