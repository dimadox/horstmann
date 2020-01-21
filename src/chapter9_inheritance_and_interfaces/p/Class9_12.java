package chapter9_inheritance_and_interfaces.p;

public class Class9_12 {
    private int xPosition;
    private int yPosition;
    private String label;

    public Class9_12(int xPosition, int yPosition, String label ){
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.label = label;
    }

    public String toString(){
        return "xPosition is " + xPosition + ", yPosition is " + yPosition + ", label is: " + label;
    }


    public static void main(String[] args) {
        Class9_12 point = new Class9_12(5, 10, "Metka");
        System.out.println(point);
    }
}
