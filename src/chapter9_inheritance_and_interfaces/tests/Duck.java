package chapter9_inheritance_and_interfaces.tests;

public class Duck implements Swimmable{
    @Override
    public void swim() {
        System.out.println("I'm swimming");
    }
}
