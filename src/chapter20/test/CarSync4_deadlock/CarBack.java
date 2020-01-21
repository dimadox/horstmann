package chapter20.test.CarSync4_deadlock;

public class CarBack implements Runnable {
    private Car car;



    public CarBack(Car car){
        this.car = car;

    }

    public void run(){


            for (int i = 0; i< CarRace.LAPS; i++){

                car.back();


                //Thread.sleep(1000);
            }









    }
}
