//package chapter20_.test.CarSync2;
//
//import chapter20_.test.CarSync3.Car;
//
//public class CarBack implements Runnable {
//    private chapter20_.test.CarSync3.Car car;
//
//
//
//    public CarBack(Car car){
//        this.car = car;
//
//    }
//
//    public void run(){
//
//        try{
//            for (int i = 0; i<20; i++){
//                car.carLock.lock();
//                try {
//                    car.back();
//                }
//                finally {
//                    car.carLock.unlock();
//                }
//
//                Thread.sleep(1000);
//            }
//        }
//        catch (InterruptedException exception){
//        }
//
//
//
//
//
//
//
//
//    }
//}
