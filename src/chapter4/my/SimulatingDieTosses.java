package chapter4.my;

public class SimulatingDieTosses {
    public static void main(String[] args) {

        double a = 0;
        double b = 0;
        int c = 0;
        for (int i = 1; i <= 10; i++) {


            // [a, b)
            // [1, 4) = {1, 2, 3}
            // # = 4 - 1 = 3
            // [0, 1)
            // [0, 1) * (b - a) => [0, b - a)
            // [0, b - a) + a => [a, b)

            a = Math.random();  // a in [0, 1)
            b = a * 6 + 1;      // [0, 1) * 6 => [0, 6)
            c = (int) b;        // [0, 6) + 1 => [1, 7)

            // [1, 7)

            // [1, 2)
            // [2, 3)
            // [3, 4)
            // [4, 5)
            // [5, 6)
            // [6, 7)

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }


    }
}
