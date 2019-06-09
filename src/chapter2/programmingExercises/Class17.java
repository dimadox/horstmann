package chapter2.programmingExercises;
import java.util.Scanner;

public class Class17 {
    public static void main(String[] args) {
        System.out.println("Please enter the first and second time:");
        Scanner s = new Scanner(System.in);
        int firstTime;
        firstTime = s.nextInt();
        int secondTime;
        secondTime = s.nextInt();

        // firstTime = 900;
        // secondTime = 1730;

        int fh = firstTime / 100;
        int fm = firstTime % 100;

        int sh = secondTime / 100;
        int sm = secondTime % 100;


        // f, s in minutes passed from 0:00
        int fx = fh * 60 + fm;
        int sx = sh * 60 + sm;


        int result = 0;

        /*
        if (sx < fx) {
            result = 24 * 60 - fx + sx;
        }
        else {
            result = sx - fx;
        }
        */

        result = (24 * 60 + sx - fx) % (24 * 60);

        System.out.println(firstTime);
        System.out.println(secondTime);

        int rh = result / 60;
        int rm = result % 60;

        System.out.printf("%04d\n", rh * 100 + rm);
        System.out.printf("%d hours %d minutes\n", rh, rm);
    }
}
