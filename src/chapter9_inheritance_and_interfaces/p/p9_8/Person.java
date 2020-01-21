package chapter9_inheritance_and_interfaces.p.p9_8;

public class Person {
    private String name;
    private int yearOfBirth;

//    public Person(){
//
//    }

    public Person(String name, int yearOfBirth){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName(){
        return name;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Person name is " + name + ", year of birth is " + yearOfBirth;
    }
}

