//package chapter20_multithreading.test.CarSync2;
//
//import chapter20_multithreading.test.CarSync3.Car;
//
//public class CarForward implements Runnable {
//    private chapter20_multithreading.test.CarSync3.Car car;
//
//
//
//    public CarForward(Car car){
//        this.car = car;
//
//    }
//
//    public void run(){
//
//        try{
//            for (int i = 0; i<20; i++){
//                car.carLock.lock();
//                car.forward();
//                car.carLock.unlock();
//
//
//                Thread.sleep(1000);
//
//            }
//        }
//        catch (InterruptedException exception){
////            car.carLock.unlock();
//            System.out.println("hello");
//        }
//
//        finally {
//
//        }
//
//
//
//
//
//
//    }
//}
