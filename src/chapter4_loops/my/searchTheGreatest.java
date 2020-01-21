package chapter4_loops.my;
import java.util.Scanner;

public class searchTheGreatest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int theGreatest = 0;
        int theGreatestValue = 0;
        int counter = 1;

        while (in.hasNextInt()){
            int input = in.nextInt();

            if (input == 0){
                System.out.println("Greatest value = " +  theGreatest + ", input number = " + theGreatestValue);
                break;
            }

            if (input > theGreatest){
                theGreatest = input;
                theGreatestValue = counter;
                System.out.println("Greatest value = " +  theGreatest + ", input number = " + theGreatestValue);
                counter++;
            }
            else {
                System.out.println("Greatest value = " +  theGreatest + ", input number = " + theGreatestValue);
                counter++;
            }

        }







    }
}
