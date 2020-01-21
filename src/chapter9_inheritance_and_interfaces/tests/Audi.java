package chapter9_inheritance_and_interfaces.tests;

public class Audi extends Car {
    int i = 10;

    public int drive(){
        int speed = 90;
        System.out.println("I'm going 90 km/h");
        return speed;
    }

    public int getI(){
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void audiHello() {
        System.out.println("i'm audi!" + i);
    }
}
