package chapter2;

import java.util.Scanner;

public class OtherStuff {
    public static void main(String[] args) {
        int i = 1;

        System.out.println(i);

        ++i;

        System.out.println(i);

        // i = i * 10;
        i *= 10;

        System.out.println(i);

        // exceptions are severe (страшные) run-time errors

        // пример: хочу вывести сколько будет 1 / 2

        // v1
        // System.out.println(1 / 0);

        // v2 (logic error)
        // System.out.println(1 / 2);

        // exceptions могут быть НЕ ПО ВИНЕ программы
        // - НЕПРЕДВИДЕННЫЕ СИТУАЦИИ
        // мануал: введите x, y, y != 0

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(x / y);

        double dInf = -5.0 / 0;
        System.out.println(dInf);
    }
}
