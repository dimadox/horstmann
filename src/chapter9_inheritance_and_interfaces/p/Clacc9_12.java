package chapter9_inheritance_and_interfaces.p;

public class Clacc9_12 {
    private double xCoordinates;
    private double yCoordinates;
    private String label;

    public Clacc9_12(double xCoordinates, double yCoordinates, String label){
        this.xCoordinates = xCoordinates;
        this.yCoordinates = yCoordinates;
        this.label = label;
    }

    @Override
    public String toString() {
        return "The point is: X = " + xCoordinates + ", Y = " + yCoordinates + ", the Label is " + label;
    }

    public static void main(String[] args) {
        Clacc9_12 point = new Clacc9_12(1, 2, "Car" );
        System.out.println(point.toString());
    }
}
