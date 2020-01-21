package chapter4_loops.my;

public class FindChar2 {
    public static void main(String[] args) {
        String string= "eqwrtyuiope";
        char findSymbol = 'e';
        char symbol = '!';
        int position = 0;
        int i = 0;
        int lenghtOfString = string.length();

        // вывести в консоль позиции всех пробелов
        // ! не то же самое, что найти позиции всех пробелов!!
        while (position < lenghtOfString)
        {
            symbol = string.charAt(position);
            if (symbol == findSymbol){
                System.out.println("Position = " + (position+1));
                position++;
                i++;
            }
            else {
                position++;
            }

        }
        if (i == 0){
            System.out.println("Nothing found");
        }




    }
}
