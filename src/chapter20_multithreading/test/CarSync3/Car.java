package chapter20_multithreading.test.CarSync3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Car{
    private int path;

    private Lock carLock;

    public Car(){
        path = 0;
        carLock = new ReentrantLock();

    }

    public void forward(){
        carLock.lock();
        try{
            path = path + 1;
            System.out.println("Path forward = " + path);
        }
        finally {
            carLock.unlock();
        }

    }

    public void back(){
        carLock.lock();
        try {
            path = path - 1;
            System.out.println("Path back = " + path);
        }
        finally {
            carLock.unlock();
        }

    }
}