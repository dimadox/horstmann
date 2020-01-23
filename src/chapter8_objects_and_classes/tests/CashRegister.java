package chapter8_objects_and_classes.tests;

public class CashRegister {
    private int itemCount; //���-�� ������
    private double totalPrice; //������ ����

    //������� �������� ������� � ��������� ��������� � ������. �����������??
    public CashRegister(){
        itemCount = 0;
        totalPrice = 0;
    }
    /**
     ��������� ����� � ���� �������� �������
     @param price ���� ����� ������
     */
    public void addItem(double price){
        itemCount++;
        totalPrice = totalPrice + price;
    }
    /**
     * ���������� ���� ���� ������� � ������� �������.
     * @return ���������� ������ ���-��
     */
    public double getTotal(){
        return totalPrice;
    }
    /**
     * ���������� ���-�� ������� � ������� �������
     * @return ���-�� ������
     */
    public int getCount(){
        return itemCount;
    }
    /**
     * ������� ���-�� ������ � ���� ���� �������
     */
    public void clear(){
        itemCount = 0;
        totalPrice = 0;
    }

}
