package chapter3_decisions.p;

public class Class328_2 {
    public static void main(String args[]) {
        int year = 1600;
        if (year%100 == 0) {
            if (year%400 == 0){
                System.out.println("it's a leap year");
            }
            else {
                System.out.println("it's not a leap year");
            }
        }
        else {
            if (year%4 == 0){
                System.out.println("it's a leap year");
            }
            else {
                System.out.println("it's not a leap year");
            }

        }
    }
}
