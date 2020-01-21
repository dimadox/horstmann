package chapter6.p;

public class Class6_11v2 {
    public static void main(String[] args) {
        boolean check1 = true;
        boolean check2 = true;
        boolean tempCheck1 = false;
        boolean tempCheck2 = false;
        int position1;
        int position2;
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {4,5,6,1,2,3};
        int[] shift = new int[array1.length]; //теперь это массив
        for (int i=0; i<array1.length; i++){
            position1 = i;
            for (int j=0; j<array2.length; j++){
                position2 = j;
                if (array1[i] == array2[j]){
                    shift[i] = position2 - position1;
                    System.out.print(shift[i] + " ");
                }
            }
        }
        for (int i=0; i<shift.length-1; i++){
            if (shift[i] != shift[i+1]){  //находим i - номер разделительного элемента

                for (int j=0; j<=i; j++) {  //проверяем все, что до i
                    if (shift[j] == shift[j + 1]) {
                        tempCheck1 = true;
                        check1 = check1 && tempCheck1;
                    }
                }

                for (int a=i+1; a<array1.length-1; a++){  //проверяем все, что после i
                    if (shift[a] == shift[a+1]){
                        tempCheck1 = true;
                        check2 = check2 && tempCheck2;
                    }

                }

            }
        }
        System.out.println(check1 + " " + check2);
        if ((check1&&check2) == true){
            System.out.println("Это одинаковые массивы со смещением");
        }
        else {
            System.out.println("Это разные массивы");
        }
    }
}
