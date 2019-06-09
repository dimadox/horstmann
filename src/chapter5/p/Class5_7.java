package chapter5.p;

public class Class5_7 {
    public static int countWords(String str){
        char space = ' ';
        int result = 0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == space)
                result++;
        }
        return result+1;
    }

    public static void main(String[] args) {
        System.out.print(countWords("qwe qwe qwe qwe"));
    }

}
