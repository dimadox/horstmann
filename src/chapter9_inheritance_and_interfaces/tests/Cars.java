package chapter9_inheritance_and_interfaces.tests;

public class Cars {
    public static void main(String[] args) {
        Audi audi;      // � ������ audi ����� ����� ��������� ������ �� ������� Audi (��� ��������� Audi)
        audi = new Audi();     // o1

        //////////////////////////

        Lada lada = new Lada();     // o2
        Honda honda = new Honda();  // o3

        Object objRef = lada;
        //////////////////////////
        System.out.println(((Lada)objRef).fly());
        //���� � ����
        Lada ladaRef = (Lada) objRef;
        System.out.println(ladaRef.fly());
    }
}
