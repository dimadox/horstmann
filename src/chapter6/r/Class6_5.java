package chapter6.r;

public class Class6_5 {
    public static void main(String[] args) {
        int[] array = {8,-1,0,7,1};
        int min = array[0];
        int max = array[0];
        for (int i=1; i<array.length; i++){
            if (array[i] >= max) {
                max = array[i];
                System.out.println("Maximum is " + max + " Index " + i);
            }
            if (array[i] <= min) {
                min = array[i];
                System.out.println("Minimum is " + min + " Index " + i);
            }
        }

    }
}
