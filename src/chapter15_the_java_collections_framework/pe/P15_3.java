package chapter15_the_java_collections_framework.pe;

import java.util.Stack;

public class P15_3 {
    public static void main(String[] args) {
        String example = "Mary had a little lamb. Its fleece was white as snow.";
        Stack<String> expression = new Stack<String>();
        String[] words = example.split("\\s");
        for (int i=0; i<words.length; i++){
            expression.push(words[i]);
        }
        String result = "";
        while (!expression.empty()){
            result = result + " " + expression.pop();
        }
        System.out.println(result);

    }
}
