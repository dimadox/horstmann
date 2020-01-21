package chapter9_inheritance_and_interfaces.p.p9_8;

public class Student extends Person{
    String major;

    public Student(String name, int yearOfBirth, String major) {
        // ��� ������ => ������ ������� � ctor Student

        super(name, yearOfBirth); //����������� ������ ������

        //��� ��� ����� ������ �������������� ����������� �����������? ��� ��� �� �����?
        this.major = major;
    }

//    public String toString(){
//        return "Name is " + getName() + "The major is " + major;
//}

    public String toString(){
        return super.toString() + "\nThe major is " + major;
    }


}
