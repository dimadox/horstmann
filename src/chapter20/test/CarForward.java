package chapter20.test;

public class CarForward implements Runnable {
    private Car car;

    public CarForward(Car car){
        this.car = car;
    }

    public void run(){
        try{
            // A
            for (int i = 0; i<20; i++){
                car.forward();
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException exception){
        };
    }
}
