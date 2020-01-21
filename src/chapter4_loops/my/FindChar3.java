package chapter4_loops.my;

import java.util.ArrayList;

public class FindChar3 {
    public static void main(String[] args) {
        String string= "eqwrteyuiope";
        char findSymbol = 'e';
        char symbol = '!';
        int position = 0;
        int i = 0;
        int lenghtOfString = string.length();

        ArrayList<Integer> positions = new ArrayList<>();

        // вывести в консоль позиции всех пробелов
        // ! не то же самое, что найти позиции всех пробелов!!
        while (position < lenghtOfString)
        {
            symbol = string.charAt(position);
            if (symbol == findSymbol){
                positions.add(position);
                position++;
                i++;
            }
            else {
                position++;
            }

        }
        if (i == 0){
            System.out.println("Nothing found");
        } else {
            for (int j = 0; j < positions.size(); j++) {
                System.out.println("Position = " + (positions.get(j) + 1));
            }
        }
    }
}
