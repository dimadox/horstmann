package chapter9_inheritance_and_interfaces.p;

import chapter9_inheritance_and_interfaces.examples.Question;

import java.util.Scanner;

public class Class9_4v2 extends Question {
    String answer1 = "";
    String answer2 = "";
    String answer3 = "";
    String answer4 = "";

    boolean check1;
    boolean check2;
    boolean check3;
    boolean check4;

    public void setAnswer(String answer, boolean check){
        answer1 = answer;
        check1 = check;
    }

    public void setAnswer2(String answer, boolean check){
        answer2 = answer;
        check2 = check;
    }

    public void setAnswer3(String answer, boolean check){
        answer3 = answer;
        check3 = check;
    }

    public void setAnswer4(String answer, boolean check){
        answer4 = answer;
        check4 = check;
    }

    public boolean checkAnswer(String answer) {
        boolean check = false;
        switch (answer) {
            case "Первый":
                if (check1) check = true;
                break;
            case "Второй":
                if (check2) check = true;
                break;
            case "Третий":
                if (check3) check = true;
                break;
            case "Четвертый":
                if (check4) check = true;
                break;
            default:
                check = false;
                break;

        }
        return check;
    }

    public static void main(String[] args) {
        Class9_4v2 AnyCorrectChoiceQuestion = new Class9_4v2();
        AnyCorrectChoiceQuestion.setText("Какой правильный вариант?");
        AnyCorrectChoiceQuestion.display();
        AnyCorrectChoiceQuestion.setAnswer("Первый", true);
        AnyCorrectChoiceQuestion.setAnswer2("Второй", false);
        AnyCorrectChoiceQuestion.setAnswer3("Третий", true);
        AnyCorrectChoiceQuestion.setAnswer4("Четвертый", false);

        Scanner s = new Scanner(System.in);
        if (AnyCorrectChoiceQuestion.checkAnswer(s.nextLine())){
            System.out.println("ответ верный");
        }
        else System.out.println("ответ не верный");
    }
}
