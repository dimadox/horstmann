package chapter9_inheritance_and_interfaces.p;

import java.awt.*;

public class Class9_11 extends Rectangle{

    // Ёто конструктор  класса Class9_11
//    public Class9_11(int width, int height){
//        super.setSize(width, height);
//    }

    //Ёто конструктор класса Class9_11, в котором вызван конструктор Rectangle
    public Class9_11(int width, int height){
        super(width, height);
    }


    public double getPerimeter(){
        int perimeter = (super.width + super.height) * 2;
        return perimeter;
    }

    /**
     * ¬ычиление площади
     * @return area
     */
    public double getArea(){
        int area = super.width * super.height;
        return area;
    }




    //test:
    public static void main(String[] args) {
        Class9_10 figure = new Class9_10(10, 10);
        System.out.println(figure.getPerimeter() + "   " + figure.getArea());
    }
}
