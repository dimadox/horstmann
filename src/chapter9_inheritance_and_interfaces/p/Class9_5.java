package chapter9_inheritance_and_interfaces.p;

import chapter9_inheritance_and_interfaces.examples.Question;

import java.util.Scanner;

public class Class9_5 extends Question {
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;

    boolean check1;
    boolean check2;
    boolean check3;
    boolean check4;

    public void setAnswer1(String answer1, boolean check1) {
        this.answer1 = answer1;
        this.check1 = check1;
    }
    public void setAnswer2(String answer2, boolean check2) {
        this.answer2 = answer2;
        this.check2 = check2;
    }
    public void setAnswer3(String answer3, boolean check3) {
        this.answer3 = answer3;
        this.check3 = check3;
    }
    public void setAnswer4(String answer4, boolean check4) {
        this.answer4 = answer4;
        this.check4 = check4;
    }

    public void checkAnswer(char response) {
        switch (response){
            case '1':
                if (check1 == true){
                    System.out.println("Ответ 1 верный");
                }break;
            case '2':
                if (check2 == true){
                    System.out.println("Ответ 2 верный");
                }break;
            case '3':
                if (check3 == true){
                    System.out.println("Ответ 3 верный");
                }break;
            case '4':
                if (check4 == true){
                    System.out.println("Ответ 4 верный");
                }break;
            default:
                System.out.println("Все ответы не верные");
        }
    }


    public static void main(String[] args) {

        Class9_5 MultiChoiceQuestion = new Class9_5();
        MultiChoiceQuestion.setText("Выберите правильные ответы, их несколько");
        MultiChoiceQuestion.setAnswer1("1", true);
        MultiChoiceQuestion.setAnswer2("2", false);
        MultiChoiceQuestion.setAnswer3("3", true);
        MultiChoiceQuestion.setAnswer4("4", false);
        MultiChoiceQuestion.display();

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        for (int i = 0; i < answer.length(); i++){
            if (answer.charAt(i) == ' '){
                MultiChoiceQuestion.checkAnswer(answer.charAt(i));
            }
        }
    }
}
