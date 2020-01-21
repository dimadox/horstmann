package chapter15_the_java_collections_framework.pe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P15_7 {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> words = new HashSet<String>();
        File filename = new File("F:\\java\\P15_7.txt");
        Scanner scanner = new Scanner(filename);
        while (scanner.hasNext()){
            words.add(scanner.next());
        }
        System.out.println(words);
        System.out.println(words.size());
    }
}
