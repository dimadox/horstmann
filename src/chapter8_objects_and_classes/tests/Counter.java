package chapter8_objects_and_classes.tests;

public class Counter {
    int value = 0;


    public void count(){
        value = value + 1;
    }

    public int getValue(){
        return value;
    }

    public void reset(){
        value = 0;
    }

}
