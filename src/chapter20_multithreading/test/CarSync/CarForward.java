package chapter20_multithreading.test.CarSync;

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
