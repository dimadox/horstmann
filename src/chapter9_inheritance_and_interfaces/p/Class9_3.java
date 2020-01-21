package chapter9_inheritance_and_interfaces.p;

import chapter9_inheritance_and_interfaces.examples.Question3;

import java.util.Scanner;

public class Class9_3 extends Question3 {


    public boolean checkAnswer(String response){
        return response.toUpperCase().equals(getAnswer());
    }






    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Class9_3 q = new Class9_3();

        q.setText("Who was the inventor of Java?");
        q.setAnswer("JAMES GOSLING");
        q.display();
        System.out.println("Your answer: ");
        String response = in.nextLine();

        System.out.println(q.checkAnswer(response));

        System.out.println(q.getAnswer());
        System.out.println(response);




    }

}
