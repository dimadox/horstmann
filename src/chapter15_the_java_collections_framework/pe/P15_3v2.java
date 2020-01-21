package chapter15_the_java_collections_framework.pe;

import java.util.Stack;

public class P15_3v2 {
    public static void main(String[] args) {
        String example = "Mary had a little lamb. Its fleece was white as snow.";

        for (String sentence: example.split("\\.")) {
            Stack<String> reversed = new Stack<String>();
            for (String w : sentence.split("\\s"))
                reversed.add(w);
            while (!reversed.isEmpty()) {
                System.out.print(reversed.pop() + " ");
            }
            System.out.print(". ");
        }
        System.out.println();
    }
}
