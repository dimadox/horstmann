package chapter9_inheritance_and_interfaces.tests;

public class Lada extends Car{
    public int fly(){
        int speed = 90;
        System.out.println("I'm going 90 km/h");
        return speed;
    }
}
