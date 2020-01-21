package chapter6.r;

public class Class6_25 {
    public static double[] fillWithRandomNumbersv2(double[] values)
    {
        double[] numbers = new double[values.length];
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = Math.random();
        }
        values = numbers;
        return numbers;
    }


    public static void fillWithRandomNumbers(double[] values)
    {
        // values -> ARR1

        // double[] numbers = new double[values.length];       // numbers -> ARR2

        // filling ARR2
        for (int i = 0; i < values.length; i++)
        {
            values[i] = Math.random();
        }

        // values = numbers;

        // values -> ARR2
    }

    public static void main(String[] args) {
        // array: array reference
        double[] array = new double[3];         // array -> ARR1
        fillWithRandomNumbers(array);

        for (int i =0; i<array.length; i++){
            System.out.println(array[i]);
        }


    }

}
