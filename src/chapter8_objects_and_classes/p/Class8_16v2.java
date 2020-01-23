package chapter8_objects_and_classes.p;

import java.util.ArrayList;
import java.util.Scanner;

public class Class8_16v2 {

    ArrayList<Double> total = new ArrayList<>();
    double sum = 0;

    /**
     ƒобавл€ет товар в этот кассовый аппарат
     @param price цена этого товара
     */
    public void addItem(double price){
        total.add(price);
        sum = sum + price;
    }
    /**
     * ¬озвращает цену всех товаров в текущей продаже.
     * @return возвращает полное кол-во
     */
    public double getTotal(){
        for (int i = 0; i<total.size(); i++){
            sum = total.get(i);
        }
        return sum;
    }
    /**
     * ¬озвращает кол-во товаров в текущей продаже
     * @return кол-во товара
     */
    public int getCount(){
        return total.size();
    }
    /**
     * ќчищает кол-во товара и цену всех товаров
     */
    public void clear(){
        for (double i : total)
        total.remove(i);
        sum = 0;

    }


    public static void main(String[] args) {
        Class8_16v2 cashRegister = new Class8_16v2();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextDouble()){
            cashRegister.addItem(scanner.nextDouble());
            System.out.println("Quantity of goods: " + cashRegister.getCount());
            System.out.println("Total price: " + cashRegister.getTotal());

        }


    }





}
