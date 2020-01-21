package chapter9_inheritance_and_interfaces.examples;

import java.util.Scanner;

public class Questiondemo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Question q = new Question();
        q.setText("Who was the inventor of Java?");
        q.setAnswer("James Gosling");

        q.display();
        System.out.println("Your answer: ");
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}
