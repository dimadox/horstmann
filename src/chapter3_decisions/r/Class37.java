package chapter3_decisions.r;

public class Class37 {
    public static void main(String[] args) {
        int n = 10;
        double m = 10.00000000001;
        System.out.println(n);
        System.out.println(m);
        final double EPSILON = 1E-8;
        if (Math.abs(n - m) < EPSILON)  {
            System.out.println("Rovno");
        }
        else {
            System.out.println("Ne rovno");
        }
    }
}
