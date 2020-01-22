package chapter7_input_output_and_exception_handling.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        // primitive types (value types)
        int i;
        i = 0;          // i - место для хранения 1 int-а

        // reference types (ссылочные)
        Scanner scanner;    // scanner - ссылка (reference), никакого объекта пока нет
        scanner = new Scanner(System.in);   // constructor называется так же, как класс
            // scanner начинает ссылаться (references) на созданный объект

        Scanner otherReference;
        otherReference = scanner;
            // назначил вторую ссылку (otherReference) на тот же объект

        scanner = null;     // null - ссылка (reference / ссылочная переменная) ни на что не указывает


        // assignment statement =
        // semantics

        int x = 10; // x = 10
        int y = x;  // y = 10   // !!! значение x было присвоено в y
        x = 5;      // x = 5

        // y = 10

        int z;  //z
        int u; // y

        //где сущ Scanner
        Scanner scanner1 = new Scanner(System.in); // ссыл на Scanner
        Scanner scanner2 = new Scanner(System.in);// ссыл на Scanner
        Scanner scanner3; // no instance is created

        //y = f(x);

         int j = 1;


    }
}
