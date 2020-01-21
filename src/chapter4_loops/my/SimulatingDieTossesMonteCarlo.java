package chapter4_loops.my;

public class SimulatingDieTossesMonteCarlo {
    public static void main(String[] args) {

        double a = 0;
        double b = 0;
        int c = 0;

        final int TRIES = 1000000;

        int total = 0;

        for (int i = 1; i <= TRIES; i++) {

            a = Math.random();  // a in [0, 1)
            b = a * 6 + 1;      // [0, 1) * 6 => [0, 6)
            c = (int) b;        // [0, 6) + 1 => [1, 7)

            a = Math.random();  // a in [0, 1)
            b = a * 6 + 1;      // [0, 1) * 6 => [0, 6)
            int c2 = (int) b;        // [0, 6) + 1 => [1, 7)

            int sum = c + c2;

            total += sum;

            // System.out.printf("%d %d (%d)\n", c, c2, sum);
        }

        System.out.println((double) total / TRIES);


    }
}
