package chapter2_fundamental_data_types.reviewExercises;

public class Class3 {
    public static void main(String[] args) {
        double s0 = 2;
        double v0 = 3;
        double t = 4;
        final double g = 9.8;
        double s = s0 + v0 * t + 0.5 * g * Math.pow(t, 2);
        System.out.println("S = " + s);


        double a = 2;
        double p = 2;
        double m1 = 2;
        double m2 = 2;
        double G = 4 * Math.pow(Math.PI, 2) * (Math.pow(a, 3) / (Math.pow(p, 2) * (m1 + m2)));
        System.out.println("G = " + G);


        double INT = 2;
        double Y = 2;
        double R = 2;
        double S = 2;
        double FV = Math.pow(INT, Y * 100 + R * 10 + S);
        System.out.println("FV = " + FV);


        double q = 2;
        double b = 2;
        double y = 1;
        double C = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + 2 * q * b * Math.cos(y));
        System.out.println("C = " + C);


    }
}
