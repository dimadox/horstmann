package chapter8_objects_and_classes.p;

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
