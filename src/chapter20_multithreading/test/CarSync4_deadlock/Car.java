package chapter20_multithreading.test.CarSync4_deadlock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Car {
    private int path;

    private Lock carLock;
    private Condition pathChangeCondition;

    public Car() {
        path = 0;
        carLock = new ReentrantLock();
        pathChangeCondition = carLock.newCondition();
    }

    public void forward() {
        carLock.lock();
        try {
            path = path + 1;
            System.out.println("Path forward = " + path);
            pathChangeCondition.signalAll();
        } finally {
            carLock.unlock();
        }

    }

//    public void back() {
//        carLock.lock();
//
//        if (path <= 0) {
//            carLock.unlock();
//            return;
//        }
//
//        path = path - 1;
//        System.out.println("Path back = " + path);
//
//        carLock.unlock();
//    }
//
//    public void back() {
//        carLock.lock();
//            while (path <= 0) {
//
//                ;
//            }
//
//            path = path - 1;
//            System.out.println("Path back = " + path);
//    }

    public void back() {
        carLock.lock();
        try {
            while (path <= 0) {
                pathChangeCondition.await();
            }

            path = path - 1;
            System.out.println("Path back = " + path);
        } catch (InterruptedException exception) {

        } finally {
            carLock.unlock();
        }

    }
}