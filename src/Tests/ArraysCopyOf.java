package Tests;
import java.util.Arrays;

public class ArraysCopyOf {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int[] array2 = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(array2));

    }
}
