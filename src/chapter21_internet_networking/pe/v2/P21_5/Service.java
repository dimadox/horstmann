package chapter21_internet_networking.pe.v2.P21_5;

public class Service {
    int number = 0;

    public Service(int number){
        this.number = number;
    }

    public int change(int number){
        return number*2;
    }
}
