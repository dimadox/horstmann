package chapter20_multithreading.test.CarSync4_deadlock;

public class CarForward implements Runnable {
    private Car car;



    public CarForward(Car car){
        this.car = car;

    }

    public void run(){


            for (int i = 0; i< CarRace.LAPS; i++){

                car.forward();



                //Thread.sleep(1000);

            }








    }
}
