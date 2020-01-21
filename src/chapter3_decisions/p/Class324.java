package chapter3_decisions.p;

public class Class324 {
    public static void main(String args[]) {
        String sm = "0"; String m = "0";  String km = "0";
        String ml = "1"; String gal = "1";  String l = "1";
        String rub = "2"; String usd = "2";  String euro = "2";

        int check1 = 4;
        int check2 = 4;
        double value1 = 0;
        double result = 0;

        //вводные данные
        String size1 = "gal";
        String size2 = "l";
        double value = 100;


        //определяем категорию для первой величины
        switch (size1) {
            case "sm": check1 = 0; break;
            case "m": check1 = 0; break;
            case "km": check1 = 0; break;
            case "ml": check1 = 1; break;
            case "l": check1 = 1; break;
            case "gal": check1 = 1; break;
            case "rub": check1 = 2; break;
            case "usd": check1 = 2; break;
            case "euro": check1 = 2; break;
            default: break;
        }
        //определяем категорию для второй величины
        switch (size2) {
            case "sm": check2 = 0; break;
            case "m": check2 = 0; break;
            case "km": check2 = 0; break;
            case "ml": check2 = 1; break;
            case "l": check2 = 1; break;
            case "gal": check2 = 1; break;
            case "rub": check2 = 2; break;
            case "usd": check2 = 2; break;
            case "euro": check2 = 2; break;
            default: break;
        }
        if (check1 == check2) {
            System.out.println("The values are correct");
            //переводим значение в минимальную величину
            switch (size1) {
                case "sm": value1 = value; break;
                case "m": value1 = value*100; break;
                case "km": value1 = value*100000; break;
                case "ml": value1 = value; break;
                case "l": value1 = value*1000; break;
                case "gal": value1 = value*10; break;
                case "rub": value1 = value; break;
                case "usd": value1 = value*65; break;
                case "euro": value1 = value * 75; break;
                default: break;
            }
            switch (size2) {
                case "sm": result = value1; break;
                case "m": result = value1/100; break;
                case "km": result = value1/100000; break;
                case "ml": result = value1; break;
                case "l": result = value1/1000; break;
                case "gal": result = value1/10; break;
                case "rub": result = value1; break;
                case "usd": result = value1/65; break;
                case "euro": result = value1/75; break;
                default: break;
            }
        }
        else{
            System.out.println("The values are not correct");
        }
        System.out.println("Converted first value: " + value1);
        System.out.println(value + " " + size1 + " = " + result + " " + size2);
    }
}
