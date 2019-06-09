package chapter2;

public class ImplicitExplicitCastDemo {
    public static void main(String[] args) {
        int i1 = 1;
        long l1 = 2;

        double d1 = 5.0;

        // засовывать БОЛЬШЕЕ в МЕНЬШЕЕ нельзя
        // т.к. потенциально - возможна потеря данных
        // !!! i1 = l1;
        // !!! i1 = d1;

        // меньшее в большее - запросто, причём implicitly (неявно)
        // implicit type conversion
        // НЕявное преобразование типа (мы об этом явно не писали)
        l1 = i1;
        d1 = i1;
        d1 = 10;


        // explicit type casting
        // явное преобразование типа

        // explicit (явное): мы явно об этом пишем
        l1 = 55;
        i1 = (int) l1; // explicitly (явно) просим сделать

        d1 = 5.5;
        i1 = (int) d1; // throw away the floating part
        System.out.println(i1);

        // есть функции double -> Sqrt -> double
        // есть функции double -> Math.Round() -> long

        d1 = 55.67;
        l1 = Math.round(d1);
        System.out.println(l1);

//        i1 = (int) Math.round(d1);
//        System.out.println(i1);
        i1 = (int) d1;
        System.out.println(i1);

        int x = 57;
        int y = 10;

        // integer division
        // (int) / (int)
        System.out.println(x / y);

        // real division
        // (double) / (double)

        // (double) / (int) / (int)
        System.out.println((double) x / 2 / y);
        // (int) / (int) / (double)
        System.out.println(x / 2 / (double) y);

        // "20" (String) -> 20 (int)
        // parsing - достаём что-то из текста
        // методы для преобразования String-ов в числовые типы
        // находятся в wrapper-классах

        String str1 = "20";
        // !!! int i5 = (int) str1;
        int i5 = Integer.parseInt(str1);

        // System.out.println(str1 * 5);
        System.out.println(i5 * 5);

        System.out.println(Double.parseDouble("20.5") * 3);

        // из любого типа данных в String
        // (строковое представление любого объекта)

        String str2 = Integer.toString(20);
        String str3 = Double.toString(55.6);

        System.out.println(str2 + str3);

        final double PI;
        PI = 3.14;

        // PI = 1;


    }
}
