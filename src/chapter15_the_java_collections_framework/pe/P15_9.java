package chapter15_the_java_collections_framework.pe;

import java.util.TreeMap;
import java.util.Map;

public class P15_9 {
    private static void addStudent(TreeMap students, String name, String grade){
        students.put(name, grade);
    }

    private static void removeStudent(TreeMap students, String name){
        students.remove(name);
    }

    private static void changeGrade(TreeMap students, String name, String grade){
        students.put(name, grade);
    }

    private static void printStudents(TreeMap students){
        System.out.println(students);
    }

    private static void main(String[] args) {
        Map<String, String> students = new TreeMap<String, String>();

    }


}
