package chapter8_objects_and_classes.p;

import java.util.Scanner;

public class Class8_16 {
    private int itemCount; //���-�� ������
    private double totalPrice; //������ ����

    //������� �������� ������� � ��������� ��������� � ������. �����������??
    public Class8_16(){
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
        Class8_16 cashRegister = new Class8_16();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextDouble()){
            cashRegister.addItem(scanner.nextDouble());
            System.out.println("Quantity of goods: " + cashRegister.getCount());
            System.out.println("Total price: " + cashRegister.getTotal());

        }


    }





}
