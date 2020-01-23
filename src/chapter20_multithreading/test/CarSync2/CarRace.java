//package chapter20_multithreading.test.CarSync2;
//
//import chapter20_multithreading.test.CarSync3.Car;
//
//public class CarRace {
//    public static void main(String[] args) {
//        chapter20_multithreading.test.CarSync3.Car car = new Car();
//
//        CarForward carForward = new CarForward(car);
//        CarBack carBack = new CarBack(car);
//
//        Thread threadForward = new Thread(carForward);
//        Thread threadBack = new Thread(carBack);
//
//        threadForward.start();
//        threadBack.start();
//    }
//
//
//}
