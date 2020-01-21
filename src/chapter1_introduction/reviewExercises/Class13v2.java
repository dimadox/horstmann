package chapter1_introduction.reviewExercises;
import java.util.Scanner;

public class Class13v2 {
    public static void main(String[] args) {
        System.out.println("Введите начальную сумму"); //Вводим начальную сумму
        Scanner s = new Scanner(System.in);  //
        double a=s.nextDouble();
        System.out.println("Введите сумму снятия"); //Вводим сумму снятия
        Scanner t = new Scanner(System.in);  //
        double dollar=t.nextDouble();
        System.out.println("Введите процент"); //Вводим процент
        Scanner q = new Scanner(System.in);  //
        double percent=q.nextDouble();
        //перенес проверку выше цикла
        if ((a==a * (1+percent*0.01) - dollar) || (a<=a * (1+percent*0.01) - dollar)) {
            System.out.println("Error: The circle will be infinity");
        }
        else {
            int i;
            for (i = 0; a > dollar; i++) {
                a = a * (1 + percent * 0.01) - dollar;
                System.out.println(a);
            }
            System.out.println("Денег хватит на " + i + " мес." + " и будет остаток " + a + " долл.");
        }

    }


}