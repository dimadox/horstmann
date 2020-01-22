package chapter7_input_output_and_exception_handling.test;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class specialTopic7_2 {
    public static void main(String[] args) throws java.io.FileNotFoundException{
        JFileChooser choose = new JFileChooser();
        Scanner scanner = null;
        if (choose.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            File selectedFile = choose.getSelectedFile();
            scanner = new Scanner(selectedFile);
        }
        while (scanner.hasNextInt()){
            System.out.println(scanner.nextInt());
        }
    }
}
