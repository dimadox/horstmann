package chapter8.tests;

import java.util.Scanner;

public class CashRegister2 {
    private int itemCount; //кол-во товара
    private double totalPrice; //полная цена
    int qwe = 1;    // default access = package access level

    //Создает кассовый аппарат с очищенным счетчиком и суммой. Конструктор??
    public CashRegister2(){
        itemCount = 0;
        totalPrice = 0;
    }
    /**
     Добавляет товар в этот кассовый аппарат
     @param price цена этого товара
     */
    public void addItem(double price){
        itemCount++;
        totalPrice = totalPrice + price;
    }
    /**
     * Возвращает цену всех товаров в текущей продаже.
     * @return возвращает полное кол-во
     */
    public double getTotal(){
        return totalPrice;
    }
    /**
     * Возвращает кол-во товаров в текущей продаже
     * @return кол-во товара
     */
    public int getCount(){
        return itemCount;
    }
    /**
     * Очищает кол-во товара и цену всех товаров
     */
    public void clear(){
        itemCount = 0;
        totalPrice = 0;
    }


    public static void main(String[] args) {
        CashRegister2 cashRegister = new CashRegister2();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextDouble()){
            cashRegister.addItem(scanner.nextDouble());
            System.out.println("Quantity of goods: " + cashRegister.getCount());
            System.out.println("Total price: " + cashRegister.getTotal());

        }

        // static methods belong to the class
        // static methods = class methods
        // CashRegister2.main(new String[] {"hello"});


    }







}
