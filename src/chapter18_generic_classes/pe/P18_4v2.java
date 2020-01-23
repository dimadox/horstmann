package chapter18_generic_classes.pe;

import chapter18_generic_classes.sc.Pair;

public class P18_4v2 {
    public static <T extends Measurable> Pair minmax(T[] array) {
        T min = array[0];
        T max = array[0];
        if (array.length > 1){
            for (int i = 0; i<array.length; i++){
                if (array[i].getMeasure() < min.getMeasure()){
                    min = array[i];
                }
                if (array[i].getMeasure() > max.getMeasure()){
                    max = array[i];
                }
            }
        }
        else System.out.println("Array has only one element");

        return new Pair(min, max);



    }




    public static void main(String[] args) {

    }
}
