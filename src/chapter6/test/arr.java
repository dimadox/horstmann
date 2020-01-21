package chapter6.test;

public class arr {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        for (int[] row:array){
            for (int x: row){
                System.out.println(x);
            }
        }
    }
}
