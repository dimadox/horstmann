package chapter20.test.CarSync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Car{
    private int path;

    public Lock carLock;

    public Car(){
        path = 0;
        carLock = new ReentrantLock();

    }




    public void forward(){
        path = path + 1;
        System.out.println("Path forward = " + path);
    }

    public void back(){
        path = path - 1;
        System.out.println("Path back = " + path);
    }
}