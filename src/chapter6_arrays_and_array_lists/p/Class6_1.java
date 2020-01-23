package chapter6_arrays_and_array_lists.p;

public class Class6_1 {
    public static void main(String[] args) {
        final int LENGTH = 10;
        int[] array = new int[LENGTH];
        for (int i = 0; i<array.length; i++){
            array[i] = (int) (Math.random()*10);
        }
        System.out.print("All: ");
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("\n" + "Every element at an even index: ");
        for (int i = 0; i<array.length; i=i+2){
            System.out.print(array[i] + " ");
        }
        System.out.print("\n" + "Every even element: ");
        for (int i = 0; i<array.length; i++){
            if (array[i] % 2 == 0)
            System.out.print(array[i] + " ");
        }
        System.out.print("\n" + "All elements in reverse order: ");
        for (int i = array.length-1;  i>= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
