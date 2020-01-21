package chapter9_inheritance_and_interfaces.p.p9_9;

public class Manager extends Employee{
    String department;

    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }

    public String toString(){
        return "The Manager is " + name + ", salary is " + salary + ", department is " + department;
    }


    public static void main(String[] args) {
        Employee dima;
        dima = new Manager("Dima", 1000, "developer");
        System.out.println(dima);
    }



}
