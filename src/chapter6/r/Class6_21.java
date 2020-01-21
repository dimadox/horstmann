package chapter6.r;

public class Class6_21 {
    public static void main(String[] args) {
        int[] array = {2,3,5,7,11,13};
        int[] array2 = new int[array.length];

        for (int i=0; i<array.length-1;i++){
            array2[i] = array[i+1];
        }
        array2[array2.length-1] = array[0];

        for (int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i=0; i<array2.length;i++){
            System.out.print(array2[i] + " ");
        }

        int temp = array[0];

        for (int i=0; i<array.length-1;i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = temp;

    }
}
