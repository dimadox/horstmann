package chapter6_arrays_and_array_lists.r;

public class Class6_8 {
    public static void main(String[] args) {
        double[] values = {1,2,3,4,5};
        double total = 0;
        for (double x : values){
            total = total + x;
        }
        System.out.println(total);

        double target = 1.0;
        for (double x : values) {
            if (x == target) {
                System.out.println("Yes");
            }
        }

        int i = 0;
        for (double x : values) {
            values[i] = 2 * x; i++;
        }
        for (int j=0; j<values.length; j++){
            System.out.println(values[j]);
        }
    }
}
