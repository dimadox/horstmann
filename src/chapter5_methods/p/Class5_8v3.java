package chapter5_methods.p;

import java.util.Scanner;

public class Class5_8v3 {
    public static String scramble(String word){
        int length = word.length();

        if (length < 4)
            return word;

        // length >= 3

        int i = (int) (Math.random() * length);
        int j = (int) (Math.random() * length);

        while (i == j || i == 0 || j == 0 || i == length - 1 || j == length - 1) {
            i = (int) (Math.random() * length);
            j = (int) (Math.random() * length);
        }

        if (i > j) {
            int t = i;
            i = j;
            j = t;
        }

        // [0, i) {j} [i + 1, j) {i} [j + 1, length)

        // System.out.println(String.format("%d %d", i, j));

        String result =
                word.substring(0, i) + word.charAt(j) + word.substring(i + 1, j)
                + word.charAt(i) + word.substring(j + 1, length);

        return result;
    }

    public static void main(String[] args) {

        String[] strArr = new String[] {"hello", "world", "I'm", "Mark",
                "Twain", "do", "you", "recognize", "me"};

        // "for each" loop
        // "for" over a collection
        // "for" over an iterable ("то, по чему можно проитерировать")

        // i = 0 (s = strArr[0])
        // s = strArr[i]

        // System.out.println("abc".substring(1,0));


        // для каждого String s из коллекции strArr
        // используется, когда нам не важны индексы
        for (String s: strArr) {
            // System.out.println(s + ": " + scramble(s));
            System.out.print(scramble(s) + " ");
        }
        System.out.println();

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s = in.next();
            System.out.print(scramble(s) + " ");
        }
        System.out.println();
    }
}
