package chapter8.p;

public class Customer {
    double amountOfPurchases = 0; //сумма покупок
    boolean discountReached;

    /**
     * Вычисляет сумму покупок
     * @param amount цена
     */
    public void makePurchase (double amount){
        amountOfPurchases = amountOfPurchases + amount;
    }

    /**
     * Наличие скидки
     */
    public boolean discountReached (){
        return discountReached = true;
    }


}
