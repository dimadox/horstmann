package chapter20_.test.CarSync3;

public class CarForward implements Runnable {
    private chapter20_.test.CarSync3.Car car;
    public CarForward(Car car){
        this.car = car;
    }

    public void run(){
        try{
            for (int i = 0; i<20; i++){
                car.forward();
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException exception){

        }
    }
}
