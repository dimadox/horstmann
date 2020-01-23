package chapter18_generic_classes.pe;
import java.util.ArrayList;

public class P18_7arrayList {
    /**
     * Проверка на четность элементов
     * @param arraylist
     * @param <T>
     * @return
     */
    public static <T> int CheckBinarySearchAlgorithm(ArrayList<T> arraylist){
        if (arraylist.size()%2 == 1){
            return 1;
        }
        else return 0;
    }

    /**
     * Бинарный поиск
     * @param arraylist
     * @param <T>
     * @return
     */

    public static <T extends java.lang.Comparable<T>> T BinarySearchAlgorithm(ArrayList<T> arraylist, T value){
        if ((arraylist.get(arraylist.size()/2)) == value){
            return value;
        }
//        else if (((arraylist.get(arraylist.size()).getMeasure() / 2)) < value.getMeasure());

        return value;
    }


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        int i = BinarySearchAlgorithm(arrayList, 1);
        System.out.println(i);
    }
}
