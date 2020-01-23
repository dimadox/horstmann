package chapter6_arrays_and_array_lists.r;

public class Class6_31 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int i =0; i<array.length; i++){
            for (int j =0; j<array.length; j++){
                array[i][j] = 0;
            }

        }

        for (int i =0; i<array.length; i++){
            for (int j =0; j<array.length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();

        }
        System.out.println();

        for (int i = 0; i<array.length; i++){
            array[0][i] = 1;

        }
        for (int i = 0; i<array.length; i++){
            array[array.length-1][i] = 1;

        }
        for (int i = 0; i<array.length; i++){
            array[i][0] = 1;

        }
        for (int i = 0; i<array.length; i++){
            array[i][array.length-1] = 1;

        }




        for (int i =0; i<array.length; i++){
            for (int j =0; j<array.length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();

        }
        System.out.println();

    }
}
