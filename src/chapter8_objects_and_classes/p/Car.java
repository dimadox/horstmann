package chapter8_objects_and_classes.p;

public class Car {
    double fuelLevel;  //������� �������
    double fuelConsumption;  //������ �������, �� 1 �� (����� 0,1)
    boolean biv;

    public Car(double fuelConsumption){
        this.fuelConsumption = fuelConsumption;




    }

    /**
     * ��������
     * @param liter ������� ������ ���������
     */
    public void addGas(double liter){
        this.fuelLevel = fuelLevel + liter;
    }

    /**
     * ��������
     * @param km ����������
     */
    public void drive(double km){
        this.fuelLevel = fuelLevel - (km * fuelConsumption);
    }

    /**
     * �������� ������� ������� �������
     * @return
     */
    public double getGasLevel(){
        return fuelLevel;
    }


}
