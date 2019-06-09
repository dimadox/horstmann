package chapter5.p;

public class Class5_1 {
    public static double smallest(double x, double y, double z){
        double theSmallest = x;
        if (x>y){
            theSmallest = y;
            if (theSmallest>z){
                theSmallest = z;
            }
        }
        return theSmallest;
    }

    public static void main(String[] args) {
        System.out.print(smallest(4, 2, 1));

    }
}
