package chapter9_inheritance_and_interfaces.p.p9_8;

public class Student extends Person{
    String major;

    public Student(String name, int yearOfBirth, String major) {
        // щас укажем => первой строкой в ctor Student

        super(name, yearOfBirth); //Обязательно первая строка

        //вот тут разве нельзя переопределить конструктор суперкласса? или это не нужно?
        this.major = major;
    }

//    public String toString(){
//        return "Name is " + getName() + "The major is " + major;
//}

    public String toString(){
        return super.toString() + "\nThe major is " + major;
    }


}
