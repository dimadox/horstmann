package chapter8_objects_and_classes.p;

public class Class8_6 {
    public static void main(String[] args) {
        Car honda = new Car(0.1);
        honda.addGas(100);
        honda.drive(100000);
        System.out.println(honda.getGasLevel());

    }
}
