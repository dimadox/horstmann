package chapter6_arrays_and_array_lists.test;

public class copyArrayTests {
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {1,2};
        array2 = array1;
        for (int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }

    }
}
