package chapter9_inheritance_and_interfaces.p.p9_9;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name is " + name + ", salary is " + salary;
    }


    public static void main(String[] args) {

        Employee dima = new Employee("Dima", 1000);
        System.out.println(dima);
    }
}
