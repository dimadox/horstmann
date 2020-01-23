package chapter8_objects_and_classes.p;

public class Car {
    double fuelLevel;  //уровень топлива
    double fuelConsumption;  //расход топлива, на 1 км (коэфф 0,1)
    boolean biv;

    public Car(double fuelConsumption){
        this.fuelConsumption = fuelConsumption;




    }

    /**
     * Заправка
     * @param liter сколько литров заправить
     */
    public void addGas(double liter){
        this.fuelLevel = fuelLevel + liter;
    }

    /**
     * Проехать
     * @param km километров
     */
    public void drive(double km){
        this.fuelLevel = fuelLevel - (km * fuelConsumption);
    }

    /**
     * Получить текущий уровень топлива
     * @return
     */
    public double getGasLevel(){
        return fuelLevel;
    }


}
