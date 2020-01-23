package chapter5_.test;

public class ModifyArguments {
    public static double addTax(double price, double rate) {
        double tax = price * rate / 100;

        price = price + tax;

        return tax;
    }

    public static double addTaxArr(double[] price, double rate) {
        double tax = price[0] * rate / 100;

        price[0] = price[0] + tax;

        return tax;
    }

    public static void main(String[] args) {
        double total = 10;
        double[] totalArr = new double[1];

        totalArr[0] = 25;

        System.out.println("Total before: " + total);
        System.out.println("totalArr[0] before: " + totalArr[0]);

        // arguments are passed by value
        // аргументы передаются по значению
        // (не сами переменные как "места", а только их "значения"
        double tax = addTax(total, 7.5);
        total = total + tax;

        addTaxArr(totalArr, 7.5);

        System.out.println("totalArr[0] after: " + totalArr[0]);
    }
}
