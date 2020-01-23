package chapter20_.test;

public class CarRace {
    public static void main(String[] args) {
        Car car = new Car();

        CarForward carForward = new CarForward(car);
        CarBack carBack = new CarBack(car);

        Thread threadForward = new Thread(carForward);
        Thread threadBack = new Thread(carBack);

        threadForward.start();  // T1S = дать разарешение (отмашку) на запуск (когда JVM сможет) кода в 1 Runnable

        // T1S

        // MainThread: T2S
        // Thread1: A

        threadBack.start(); // T2S


        // T1S

        // MainThread: --
        // Thread1: A
        // Thread2: B

    }
}
