package chapter6_arrays_and_array_lists.p;

import java.util.ArrayList;

public class Class_6_18 {
    public static void main(String[] args) {

        boolean check = true;
        ArrayList<Integer> temp = new ArrayList<Integer>();
//        int[][] array = new int[3][3];
//        Scanner s = new Scanner(System.in);
//        for (int i = 0; i<array.length;i++){
//            for (int j = 0; j<array.length;j++){
//                array[i][j] = s.nextInt();
//            }
//        }
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        for (int i = 0; i<array.length;i++){        //перенес в строку эрей листа
            for (int j = 0; j<array.length;j++){
                temp.add(array[i][j]);


            }
        }

        for (int i = 0; i<temp.size()-1;i++){
            for (int j = i; j<temp.size()-1;j++){
                if (temp.get(i) == temp.get(i+j)){
                    check = false;
                }

            }


        }

        //for (in)


        System.out.println(temp);
        System.out.println(check);










        for (int i = 0; i<array.length;i++){
            for (int j = 0; j<array.length;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }
}
