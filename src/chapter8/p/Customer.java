package chapter8.p;

public class Customer {
    double amountOfPurchases = 0; //����� �������
    boolean discountReached;

    /**
     * ��������� ����� �������
     * @param amount ����
     */
    public void makePurchase (double amount){
        amountOfPurchases = amountOfPurchases + amount;
    }

    /**
     * ������� ������
     */
    public boolean discountReached (){
        return discountReached = true;
    }


}
