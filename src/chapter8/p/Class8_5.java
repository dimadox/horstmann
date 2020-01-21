package chapter8.p;

public class Class8_5 {
    double edge;
    double volume;

    //Конструктор
    public Class8_5(double edge){
//        this.edge = edge;
//        this.volume = volume;

        this.edge = edge;

        double edge1 = edge;

        this.volume = Math.pow(edge, 3);
    }


    public double getVolume(){
        return volume;
    }

//    public double getVolume(int edge){
//        volume = Math.pow(edge, 3);
//        return volume;
//    }

    public static void main(String[] args) {

    }

}
