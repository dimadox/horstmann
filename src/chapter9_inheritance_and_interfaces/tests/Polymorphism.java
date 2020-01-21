package chapter9_inheritance_and_interfaces.tests;

public class Polymorphism {
    public static void main(String[] args) {


//        Array [] names = new Array[1];        // reference type: Array, object type: Array
//        Honda civic = new Honda();

        // a reference can reference an object of any compatible type:
        // type of the reference or any of its subclasses
        // LISKOV substitution principle:
        // ����� ������ ��������� �������� �������� �����������

        //Car car1 = new Honda();    // reference type: Car, object type: Honda
        //Car car2 = new Audi();    //��������� ������ ���� Audi. ��� ������ Car
        //Car car3 = new Lamba();   //����� - ���� �� ��������, ����� ����� ������. ������ - ���� �� ��������, ����� ���������� ������

        Honda car1 = new Honda();
        Audi car2 = new Audi();
        Lamba car3 = new Lamba();

        car1.drive();
        car2.drive();
        car3.drive();

        Car[] cars = new Car[] {car1, car2, car3};
        for (Car c: cars) {
            c.drive();
        }
    }
}
