package chapter9_inheritance_and_interfaces.tests;

public class Test {
    public static void main(String[] args) {
        new Audi();
        (new Audi()).drive();
        Audi a; //������ ���� Audi, ��� �������� int a
        a = new Audi();


        //������, �� ������� ��������� ������ ���� Audi �������� ���� ��������
        // ������ Audi, ���� ������ �� ��� ����������, �������� Audi one = new Q8()

        Audi one = new Audi(); //��� Audi ����� ������, ������ ���� � ������ Audi

        //������, �� ������� ��������� ������ ���� Car �������� ���� ��������
        // ������ Car, ���� ������ �� ��� ����������: Car, Audi, Honda, Lamba, Q8

        Car two = new Audi(); //��� Car ����� ������, ������ ���� � ������ Car. ����� ����� ��� ���











    }
}

