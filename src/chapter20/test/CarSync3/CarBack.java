package chapter20.test.CarSync3;

public class CarBack implements Runnable {
    private chapter20.test.CarSync3.Car car;



    public CarBack(Car car){
        this.car = car;

    }

    public void run(){

        try{
            for (int i = 0; i<20; i++){

                car.back();


                Thread.sleep(1000);
            }
        }
        catch (InterruptedException exception){

        }








    }
}
