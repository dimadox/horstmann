package chapter9_inheritance_and_interfaces.p;

import chapter9_inheritance_and_interfaces.examples.Question;

public class Class9_1 extends Question {
    private double number = 0;

    public void setNumberAnswer(double number){
        this.number = number;
    }

    public boolean checkNumberAnswer(double number){
        boolean check = false;
        if ((Math.abs(this.number - number)) < 0.01){
            check = true;
        }
        return check;

    }




    /**
     * For tests
     */

    public static void main(String[] args) {
        Class9_1 numberQuestion = new Class9_1();
        numberQuestion.setNumberAnswer(5);
        System.out.println(numberQuestion.checkNumberAnswer(5.004));
    }
}
