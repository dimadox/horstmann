package chapter15_the_java_collections_framework.pe;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P15_9v2 {
    public static void main(String[] args) {
        Map<String, String> students = new TreeMap<String, String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a command");
        while (scanner.hasNext()) {
            String command = scanner.next();
            String name = scanner.next();
            String grade = scanner.next();

            switch (command){
                case "add": students.put(name, grade); break;
                case "remove": students.remove(name); break;
                case "rename": students.put(name, grade); break;
                default: System.out.println("Command not found"); break;
            }
            System.out.println("Students and grades: " + students);
        }
    }


}
