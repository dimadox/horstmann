package chapter7_input_output_and_exception_handling.p;

import java.io.File;
import java.util.Scanner;

public class Class7_5 {
    public static void main(String[] args) throws java.io.FileNotFoundException {
//        System.out.println("Введите путь до файла");
//        Scanner filePath = new Scanner(System.in);
//        String inputFile = filePath.nextLine();

        String inputFile = "F://java//hello";

        File input = new File(inputFile);
        Scanner scanner = new Scanner(input);

        String string = "";

        int numberOfLines = 0; //кол-во строк +
        int numberOfCharacters = 0; //кол-во символов без пробела +
        int numberOfWords = 0; //кол-во слов +

        while (scanner.hasNextLine()){
            string = string + scanner.nextLine() + " ";
            numberOfLines++;

        }

        for (int i = 0; i<string.length(); i++){
            if (string.charAt(i) != ' '){
                numberOfCharacters++;
            }
        }

        for (int i = 0; i<string.length(); i++){
            if ((string.charAt(i) == ' ')){
                numberOfWords++;
            }
        }

        System.out.println("строка " + string);
        System.out.println("кол-во строк: " + numberOfLines);
        System.out.println("кол-во символов: " + string.length());
        System.out.println("кол-во символов без пробела: " + numberOfCharacters);
        System.out.println("кол-во слов: " + numberOfWords);

    }
}
