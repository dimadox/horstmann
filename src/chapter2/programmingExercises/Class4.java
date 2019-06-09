package chapter2.programmingExercises;
import java.util.Scanner;

public class Class4 {
    public static void main(String[] args) {
        System.out.println("Input the first number");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("Input the second number");
        int b = s.nextInt();

//        int a=4;
//        int b=6;

        double difference = a - b; //Разность
        System.out.println("Difference: " + difference);
        double distance = Math.abs(difference); //Разность по модулю
        System.out.println("Distance: " + distance);
        int max=Math.max(a, b); //Максимальное из двух
        System.out.println("Max: " + max);
        int min=Math.min(a, b); //Минимальное из двух
        System.out.println("Min: " + min);

        int notInitialized;

        notInitialized = 10;    // we initialize it! (инициализируем)

        notInitialized = 20;    // assignment (присваивание)

        final int finalizedInt;

        finalizedInt = 3;   // initialization!
        // finalizedInt = 5; // cannot do this with final variables!

        double price =4.35;
        double quantity=100;
        double total =price*quantity;//­Should be­100­*­4.35­=­435
        System.out.println(total);


        System.out.println(Math.abs(total - 435) <= 1e-6);

    }
}
