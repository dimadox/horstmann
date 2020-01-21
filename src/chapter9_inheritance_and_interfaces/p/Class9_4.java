package chapter9_inheritance_and_interfaces.p;

import chapter9_inheritance_and_interfaces.examples.Question;

import java.util.Scanner;

public class Class9_4 extends Question {
    String answer1 = "";
    String answer2 = "";
    String answer3 = "";
    String answer4 = "";

    boolean check1 = false;
    boolean check2 = false;
    boolean check3 = false;
    boolean check4 = false;

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

    public void checkAnswer2(String answer) {
        switch (answer){
            case "������": if (check1) System.out.println("������ ������"); break;
            case "������": if (check2) System.out.println("������ ������"); break;
            case "������": if (check3) System.out.println("������ ������"); break;
            case "���������": if (check4) System.out.println("������ ������"); break;
            default:
                System.out.println("����� ��������"); break;

        }
    }

    public static void main(String[] args) {
        Class9_4 AnyCorrectChoiceQuestion = new Class9_4();
        AnyCorrectChoiceQuestion.setText("����� ���������� �������?");
        AnyCorrectChoiceQuestion.setAnswer("������", true);
        AnyCorrectChoiceQuestion.setAnswer2("������", false);
        AnyCorrectChoiceQuestion.setAnswer3("������", false);
        AnyCorrectChoiceQuestion.setAnswer4("���������", false);

        Scanner s = new Scanner(System.in);
        AnyCorrectChoiceQuestion.checkAnswer2(s.nextLine());

    }
}
