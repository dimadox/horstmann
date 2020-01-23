package chapter5_.p;
import java.util.Scanner;

public class Class5_10 {
    public static double readDouble(String prompt){
        System.out.print("Please enter your salary: ");
        Scanner s = new Scanner(System.in);
        int q=s.nextInt();
        System.out.println("Your salary is " + q);
        return 0;
    }

    public static void main(String[] args) {
        readDouble("qw");
    }
}
