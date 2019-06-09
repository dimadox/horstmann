package chapter1.reviewExercises;

public class Class18v2 {
    public static void main(String[] args) {
        int n = 3;
        int sign = -1;
        double p = 1;

        final int MAX_ITERATIONS = (int) 1e9;
        final double EPS = 1e-9;

        int i = 0;
        while (i < MAX_ITERATIONS) {
            double term = (double) sign / n;
            // System.out.println("term = " + term);
            if (Math.abs(term) <= EPS)
                break;
            p += term;
            //System.out.println("pi = " + p);

            n = n + 2;
            sign *= -1;

            i++;
        }
        p=p*4;
        System.out.println(p);
        System.out.println(i);
    }
}
