package chapter9_inheritance_and_interfaces.p;

import chapter9_inheritance_and_interfaces.examples.Question;

import java.util.Scanner;

public class Class9_5v4 extends Question {
    final int numberOfResponses = 4;
    String responseArray [] = new String[numberOfResponses];
    boolean booleanArray [] = new boolean[numberOfResponses];

    public void setAnswer(int index, String response, boolean check) {
        responseArray[index] = response;
        booleanArray[index] = check;
    }

    public String displayResponses(){
        return "1." + (responseArray [0]) + "\n" +
               "2." + (responseArray [1]) + "\n" +
               "3." + (responseArray [2]) + "\n" +
               "4." + (responseArray [3]) + "\n";
    }


    /**
     *
     * @param index
     * @return просто возвращаем индекс!!!
     */
    public boolean checkAnswer(int index) {
        return booleanArray[index];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Class9_5v4 q = new Class9_5v4();
        q.setText("Who was the inventor of Java?");
        q.setAnswer(0,"John", false);
        q.setAnswer(1,"James Gosling", true);
        q.setAnswer(2,"Dima", false);
        q.setAnswer(3,"Gosling", true);

        q.display();
        System.out.println(q.displayResponses());
        System.out.println("Your answer: ");

        // Scanner parses ints

        /*
        while(in.hasNextInt()) {
            int response = in.nextInt();
            System.out.println(q.checkAnswer(response-1));
        }
        */

        // Scanner parses ints from a line

        /*
        String inp = in.nextLine();

        Scanner inpScan = new Scanner(inp);

        while(inpScan.hasNextInt()) {
            int response = inpScan.nextInt();
            System.out.println(q.checkAnswer(response-1));
        }
        */

        // Java 8 Stream API


    }
}

