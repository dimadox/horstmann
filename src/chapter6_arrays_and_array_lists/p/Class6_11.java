package chapter6_arrays_and_array_lists.p;

public class Class6_11 {
    public static void main(String[] args) {
        boolean check = false;
        int position1;
        int position2;
        int shift = 0;

        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {5,6,1,2,3,4};
        for (int i=0; i<array1.length; i++){
            position1 = i;
            for (int j=0; j<array2.length; j++){
                position2 = j;
                if (array1[i] == array2[j]){
                    shift = position2 - position1;
                    System.out.print(shift + " ");  //если +, то смещение вправо, если -, то влево
                }
            }
        }
    }
}
