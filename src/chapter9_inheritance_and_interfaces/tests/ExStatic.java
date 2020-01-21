package chapter9_inheritance_and_interfaces.tests;

public class ExStatic {

    public static double plusTwo(double number){
        double total = number + 2;
        return total;
    }

    public static void main(String[] args) {
        double i = plusTwo(2);
        System.out.println(i);
    }
}
