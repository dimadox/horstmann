package chapter8_objects_and_classes.tests;

public class CashRegister {
    private int itemCount; //кол-во товара
    private double totalPrice; //полная цена

    //Создает кассовый аппарат с очищенным счетчиком и суммой. Конструктор??
    public CashRegister(){
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

}
