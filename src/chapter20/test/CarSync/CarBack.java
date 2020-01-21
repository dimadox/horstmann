package chapter20.test.CarSync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CarBack implements Runnable {
    private Car car;



    public CarBack(Car car){
        this.car = car;

    }

    public void run(){
        car.carLock.lock();
        try{
            for (int i = 0; i<20; i++){
                car.back();
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
