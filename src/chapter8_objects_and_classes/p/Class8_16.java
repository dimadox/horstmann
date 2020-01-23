package chapter8_objects_and_classes.p;

import java.util.Scanner;

public class Class8_16 {
    private int itemCount; //кол-во товара
    private double totalPrice; //полная цена

    //Создает кассовый аппарат с очищенным счетчиком и суммой. Конструктор??
    public Class8_16(){
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
        Class8_16 cashRegister = new Class8_16();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextDouble()){
            cashRegister.addItem(scanner.nextDouble());
            System.out.println("Quantity of goods: " + cashRegister.getCount());
            System.out.println("Total price: " + cashRegister.getTotal());

        }


    }





}
