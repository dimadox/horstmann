package chapter9_inheritance_and_interfaces.p.p9_8;

public class Instructor extends Person{
    double salary = 0;

    public Instructor(String name, int yearOfBirth, double salary){
        super(name, yearOfBirth);
        this.salary = salary;
    }
}
