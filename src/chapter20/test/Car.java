package chapter20.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Car{
    private int path = 0;

    public void forward(){
        path = path + 1;
        System.out.println("Path forward = " + path);
    }

    public void back(){
        path = path - 1;
        System.out.println("Path back = " + path);
    }
}