package chapter8;

import chapter8.tests.CashRegister2;

public class DefaultAccessAlienPackage {
    public static void main(String[] args) {
        CashRegister2 cr2 = new CashRegister2();
        // !! cr2.qwe = 10;
    }
}
