package chapter8.tests;

import java.util.Scanner;

public class CashRegister2 {
    private int itemCount; //���-�� ������
    private double totalPrice; //������ ����
    int qwe = 1;    // default access = package access level

    //������� �������� ������� � ��������� ��������� � ������. �����������??
    public CashRegister2(){
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
