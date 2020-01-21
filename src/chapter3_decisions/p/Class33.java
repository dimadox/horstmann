package chapter3_decisions.p;

public class Class33 {
    public static void main(String[] args) {
        final int INVERSION = -1;
        final int TEN = 10;
        final int HUNDRED = 100;
        final int THOUSAND = 1000;
        final int TENTHOUSAND = 10000;
        double number = 15655;

        if (number <= 0) {
            number = number * INVERSION;
        }

        if (number >= 10) {
            if ((number >= 100)) {
                if (number >= 1000) {
                    if (number >= 10000) {
                        System.out.println("5");
                    } else {
                        System.out.println("4");
                    }
                } else {
                    System.out.println("3");
                }
            } else {
                System.out.println("2");
            }
        } else {
            System.out.println("1");
        }

        // 0, 10
        // 10, 100
        // 1000, 10000
        // ...


        if (number < 10)
            System.out.println("1");
        else if ((number < 100))
            System.out.println("2");
        else if (number < 1000)
            System.out.println("3");
        else if (number < 10000)
            System.out.println("4");
        else
            System.out.println("5");

    }
}
