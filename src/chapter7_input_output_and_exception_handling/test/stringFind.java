package chapter7_input_output_and_exception_handling.test;

public class stringFind {
    public static void main(String[] args) {
        String string = "gf qwe fgdfg qwe rty";
        String word = "qwe";
        int wordLenght = word.length();
        for (int i=0; i<(string.length()-word.length()-1);i++){
            System.out.print("Сейчас ищется подстрока " + (string.substring(i, i+wordLenght)));

            if (word.equals((string.substring(i, i+wordLenght)))){
                System.out.print(" <--- Найдено");


            }
            System.out.println();



        }

    }
}
