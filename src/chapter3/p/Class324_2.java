package chapter3.p;

import java.util.HashMap;
import java.util.Map;

enum Type { LENGTH, VOLUME, CURRENCY, OTHER}

public class Class324_2 {
    public static void main(String args[]) {

        Type check1;
        Type check2;
        double value1 = 0;
        double result = 0;

        //вводные данные
        String size1 = "rub";
        String size2 = "swf";
        double value = 100;

        Map<String, Type> valueTypes = new HashMap<>();

        valueTypes.put("sm", Type.LENGTH);
        valueTypes.put("m", Type.LENGTH);
        valueTypes.put("km", Type.LENGTH);
        valueTypes.put("ml", Type.VOLUME);
        valueTypes.put("l", Type.VOLUME);
        valueTypes.put("gal", Type.VOLUME);
        valueTypes.put("rub", Type.CURRENCY);
        valueTypes.put("usd", Type.CURRENCY);
        valueTypes.put("euro", Type.CURRENCY);
        valueTypes.put("swf", Type.CURRENCY);


        // System.out.println(valueTypes.get("sm"));

        Map<String, Double> factors =
                new HashMap<>();

        factors.put("sm", Double.valueOf(1));
        factors.put("m", Double.valueOf(100));
        factors.put("km", Double.valueOf(100000));
        factors.put("ml", Double.valueOf(1));
        factors.put("l", Double.valueOf(1000));
        factors.put("gal", Double.valueOf(10));
        factors.put("rub", Double.valueOf(1));
        factors.put("usd", Double.valueOf(65));
        factors.put("euro", Double.valueOf(75));
        factors.put("swf", Double.valueOf(200));

        check1 = valueTypes.get(size1);
        if (check1 == null)
            check1 = Type.OTHER;

        check2 = valueTypes.get(size2);
        if (check2 == null)
            check2 = Type.OTHER;

        if (check1 == check2) {
            System.out.println("The values are correct");

            value1 = value * factors.get(size1);
            result = value1 / factors.get(size2);

            System.out.println("Converted first value: " + value1);
            System.out.println(value + " " + size1 + " = " + result + " " + size2);
        }
        else{
            System.out.println("The values are not correct");
            System.out.println("Cannot convert from: " + check1);
            System.out.println("to: " + check2);

        }
    }
}
