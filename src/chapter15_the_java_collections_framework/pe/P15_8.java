package chapter15_the_java_collections_framework.pe;

import java.util.HashSet;
import java.util.Set;

public class P15_8 {
    public static void main(String[] args) {
        int limitNumber = 40;
        Set<Integer> numbers = new HashSet<Integer>();
        for (int i=2; i<limitNumber; i++){
            numbers.add(i);
        }

        for (int i=3; i<limitNumber; i++){
            if ((i%2 == 0) || (i%3 == 0) || (i%(Math.sqrt(i))==0)) {
                numbers.remove(i);
            }
        }
        System.out.println(numbers);
    }
}
