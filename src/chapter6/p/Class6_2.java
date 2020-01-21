package chapter6.p;

public class Class6_2 {
    public static void main(String[] args) {
        int[] array = {1,9,3,4,5, 6, 7};
        int[] array2 = d(array);
        for (int i = 0; i<array2.length; i++){
            System.out.print(array2[i] + " ");
        }
    }

    public static int[] a (int[] array){
        int[] resultArray = new int[array.length];
        for (int i=0; i<array.length; i++)
            resultArray[i] = array[i];
        resultArray[resultArray.length-1] = array[0];
        resultArray[0] = array[array.length-1];

        return resultArray;
    }
    public static int[] b (int[] array){
        int[] resultArray = new int[array.length];
        for (int i=0; i<array.length; i++)
            resultArray[i] = array[i];
        resultArray[0] = array[array.length-1];
        for (int i=1; i<(array.length); i++){
            resultArray[i] = array[i-1];
        }
        return resultArray;
    }

    public static int[] d (int[] array){
        for(int i=1; i<array.length-1; i++){
            if (array[i-1] > array[i]){
                array[i] = array[i-1];
            }
            if (array[i+1] > array[i]){
                array[i] = array[i+1];
            }
        }
        return array;
    }











}
