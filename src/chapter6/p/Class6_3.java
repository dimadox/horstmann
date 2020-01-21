package chapter6.p;

public class Class6_3 {
    public static int[] SwapTheFirstAndLast (int[] array){
        int[] resultArray = new int[10];
        for (int i=0; i<array.length; i++){
            resultArray[i] = array [i];
        }
        return resultArray;
    }



    public static void main(String[] args) {
        int[] array = {1,2,100,4,5,6,7,8,9,10};
        int[] array2 = SwapTheFirstAndLast(array);


        for (int i = 0; i<array2.length; i++){
            System.out.print(array2[i] + " ");
        }

    }



}
