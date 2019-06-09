package chapter1.reviewExercises;
import java.util.Scanner;

public class Class14 {
    public static void main(String[] args) {
        double width;
        double length;
        double height;
        double nOfWD;
        double wOfWD;
        double hOfWD;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the width (ширина)"); //ширина
        width=in.nextDouble();
        System.out.println("Enter the length (длина)"); //длина
        length=in.nextDouble();
        System.out.println("Enter the height (высота)"); //Высота
        height =in.nextDouble();
        System.out.println("Enter the number of windows and doors"); //кол-во
        nOfWD=in.nextDouble();
        System.out.println("Enter the width of windows and doors"); //ширина
        wOfWD=in.nextDouble();
        System.out.println("Enter the height of windows and doors"); //высота
        hOfWD=in.nextDouble();

        // in: w, l, h, nofW, wofW, hOfWD
        double square = width*length+(length*height+width*height)* 2 - nOfWD*wOfWD*hOfWD;
        // out: square

        System.out.println("Square is " + square);

    }
}
