package chapter15_the_java_collections_framework.pe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P15_13 {
    public static void main(String[] args) throws FileNotFoundException {
        File filename = new File("F:\\java\\words.txt");
        Scanner scanner = new Scanner(filename);

        //Тут выбираем коллекцию
        Set<String> words = new TreeSet<String>();
//        Set<String> words = new HashSet<String>();

        while (scanner.hasNext()){
            words.add(scanner.next());
        }
        System.out.println(words);


    }


}
