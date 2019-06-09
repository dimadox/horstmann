package chapter2.programmingExercises;
import java.util.Scanner;

public class Class19 {
    public static void main(String[] args) {
        String allMonth = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
        //System.out.println("Please enter the number of month");
        //Scanner s = new Scanner(System.in);
        //int month = s.nextInt();
        for (int i=1; i<13; i++) {
            int month = i;
            System.out.println(allMonth.substring(month * 9 - 9, month * 9));
        }
    }

}
