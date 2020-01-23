package chapter20_multithreading.test;

public class CarBack implements Runnable {
    private Car car;


    public CarBack(Car car){
        this.car = car;
    }

    public void run(){


        try{
            // B
            for (int i = 0; i<20; i++){
                car.back();
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException exception){
        };
    }
}
