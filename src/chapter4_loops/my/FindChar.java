package chapter4_loops.my;

public class FindChar {
    public static void main(String[] args) {
        String string= "qwertyuiope";
        char findSymbol = 'e';
        char symbol = '!';
        int position = 0;
        int lenghtOfString = string.length();
        boolean found = false;
        while (!found && position < lenghtOfString)
        {
            symbol = string.charAt(position);
            if (symbol == findSymbol){
                found = true;
                System.out.println("Position = " + position);
            }
            else {
                position++;
            }
        }











    }
}
