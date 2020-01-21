package chapter20.test.CarSync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CarForward implements Runnable {
    private Car car;



    public CarForward(Car car){
        this.car = car;

    }

    public void run(){
        car.carLock.lock();
        try{
            for (int i = 0; i<20; i++){
                car.forward();
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException exception){

        }

        finally {
            car.carLock.unlock();
        }





    }
}
