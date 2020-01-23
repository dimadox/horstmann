package chapter6_arrays_and_array_lists.p;

public class Class6_6 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int sum = 0;
        for (int i=0; i<array.length; i++){
            if (i%2 == 0){   //для четных
                sum = sum + array[i];
            }
            else {  //для нечетных
                sum = sum - array[i];
            }
        }
        System.out.print(array[0] + " ");
        for (int i=1; i<array.length; i++){
            if (i%2 == 0){   //для четных
                System.out.print("+ ");;
            }
            else {  //для нечетных
                System.out.print("- ");;
            }
            System.out.print(array[i] + " ");
        }
        System.out.print("= " + sum);

    }
}
