package chapter20_.test.CarSync4_deadlock;

public class CarRace {
    public static int LAPS = 200000;
    public static void main(String[] args) {
        Car car = new Car();

        CarForward carForward = new CarForward(car);
        CarBack carBack = new CarBack(car);

        Thread threadForward = new Thread(carForward);
        Thread threadBack = new Thread(carBack);
        Thread threadBack2 = new Thread(carBack);
        Thread threadBack3 = new Thread(carBack);
        Thread threadBack4 = new Thread(carBack);

        threadForward.start();
        threadBack.start();
        //threadBack2.start();
        //threadBack3.start();
        //threadBack4.start();
    }


}
