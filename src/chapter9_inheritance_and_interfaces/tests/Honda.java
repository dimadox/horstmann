package chapter9_inheritance_and_interfaces.tests;

public class Honda extends Car {
    public int drive(){
        int speed = 70;
        System.out.println("I'm going 70 km/h");
        return speed;
    }
}
