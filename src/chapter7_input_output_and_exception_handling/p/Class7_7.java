package chapter7_input_output_and_exception_handling.p;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Class7_7 {
    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("F://java//P77.txt");
        Scanner inputFile = new Scanner(input);

        File input2 = new File("F://java//P77list.txt");
        Scanner inputArray = new Scanner(input2);

        ArrayList<String> File = new ArrayList<String>();
        ArrayList<String> Array = new ArrayList<String>();

        while (inputFile.hasNext()){
            File.add(inputFile.next());
        }

        while (inputArray.hasNext()){
            Array.add(inputArray.next());
        }
        System.out.println(File);
        System.out.println(Array);
        System.out.println();

        for (int m = 0; m<File.size();m++){
            String i = File.get(m);
            System.out.print(i);

            if (Array.contains(i))
                System.out.print("...found");

            for (int n = 0; n<Array.size();n++){
                String j = Array.get(n);
                if (i.equals(j)) {
                    System.out.print(" <--- found in dictionary");
                }
            }
            System.out.println();

        }
    }
}
