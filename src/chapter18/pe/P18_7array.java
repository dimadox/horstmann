package chapter18.pe;

public class P18_7array {
    public static <T> int BinarySearchAlgorithm(T[] array, T number){
        if (array.length%2 == 1){
            return 1;
        }
        else
            return -1;
    }


    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5};
        int i = P18_7array.BinarySearchAlgorithm(array, 1);
        System.out.println(i);
    }
}
