package chapter3_decisions.p;

public class Class32 {
    public static void main(String[] args) {
        final double EPSILON = 0.00001;
        final int CHECKNUMBER = 1;
        double number = 0.5;
        if ((number-0)<EPSILON){
            System.out.println("it's zero");
        }
        else {
            if (number>0){
                System.out.println("it's above zero");
            }
            else{
                System.out.println("it's less than zero");
            }

            if (Math.abs(number) < CHECKNUMBER) {
                System.out.println("it's small");
            }
            else {
                System.out.println("it's large");
            }

        }

    }
}
