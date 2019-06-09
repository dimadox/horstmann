package chapter1.reviewExercises;
import java.util.Scanner;

public class Class13 {
    public static void main(String[] args) {
        System.out.println("Введите начальную сумму"); //Вводим начальную сумму
        Scanner s = new Scanner(System.in);  //

        double a;
        // a = s.nextDouble();
        a = 499;
        System.out.println("Введите сумму снятия"); //Вводим сумму снятия

        double dollar;
        // dollar = s.nextDouble();
        dollar = 100;

        double percent;
        System.out.println("Введите процент"); //Вводим процент
        // percent = s.nextDouble();
        percent = 0.5;

        int i;
        if (a <= a * (1+percent*0.01) - dollar) {
            System.out.println("Error: The circle is incorrect");
        } else {
            for (i = 0; a > dollar; i++) {
                a = a * (1+percent*0.01) - dollar;
                System.out.println(a);

                //вот эта проверка ниже не работает на больших числах
                //и почему я не могу поставить ее до цикла?
            }
            System.out.println("Денег хватит на " + i + " мес." + " и будет остаток " + a + " долл.");
        }

    }
}