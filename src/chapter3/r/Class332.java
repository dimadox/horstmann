package chapter3.r;

import java.util.Scanner;

public class Class332 {
    public static void main(String[] args) {
        System.out.print("Enter the number of quarters: ");
        Scanner in = new Scanner(System.in);

        /*
        int quarters = in.nextInt();

        if (in.hasNextInt())
        {
            double total = 0;
            total = total + quarters * 0.25;
            System.out.println("Total: " + total);
        }
        else
        {
            System.out.println("Input error.");
        }
        */

        if (in.hasNextInt()) {
            int quarters = in.nextInt();
            System.out.println("quarterxs = " + quarters);
        } else
        {
            System.out.println("fuck off, I expected an int!");
            double d = in.nextDouble();
            System.out.println("you moron... " + d);
        }



    }
}
