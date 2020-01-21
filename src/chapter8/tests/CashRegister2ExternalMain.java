package chapter8.tests;

import java.util.Scanner;

public class CashRegister2ExternalMain {
    public static void main(String[] args) {
        CashRegister2 cashRegister = new CashRegister2();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextDouble()){
            cashRegister.addItem(scanner.nextDouble());
            System.out.println("Quantity of goods: " + cashRegister.getCount());
            System.out.println("Total price: " + cashRegister.getTotal());

        }
    }
}
