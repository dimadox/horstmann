package chapter6.p;

public class Class6_4 {
    public static void main(String[] args) {
        int[] array = {1,1,3,4};
        int summ = sumWithoutSmallest(array);
        System.out.print(summ);
    }


    public static int sumWithoutSmallest (int[] array) {
        int theSmallest = array [0];
        int summ = theSmallest;
        for (int i=1; i<array.length; i++){
            if (array[i] < theSmallest){
                theSmallest = array[i];
            }
            summ = summ + array[i];
        }
        summ = summ - theSmallest;


        return summ;
    }
}
