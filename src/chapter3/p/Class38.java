package chapter3.p;

public class Class38 {
    public static void main(String args[]) {
        int theFirst = 1;
        int theSecond = 0;
        int theThird = 1;
        int theFourth = 0;

        if ((theFirst == theSecond) && (theThird == theFourth)) {
            System.out.println("two pairs");
        } else if ((theFirst == theThird) && (theSecond == theFourth)) {
            System.out.println("two pairs");
        } else if ((theFirst == theFourth) && (theSecond == theThird)) {
            System.out.println("two pairs");
        } else {
            System.out.println("not two pairs");
        }


    }
}
