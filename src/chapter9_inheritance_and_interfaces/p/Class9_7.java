package chapter9_inheritance_and_interfaces.p;

import chapter9_inheritance_and_interfaces.examples.Question2;

import java.util.Scanner;

public class Class9_7 extends Question2 {
    public String toString(){
        return "Question [The question is: \" " + super.toString() + " \"]";
    }





    //test
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Class9_7 q = new Class9_7();
        q.setText("Who was the inventor of Java?");
        q.setAnswer("James Gosling");

        q.display();
        System.out.println("Your answer: ");
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
        System.out.println(q.toString());
    }
}
