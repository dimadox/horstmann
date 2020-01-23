package chapter5_.p;

public class Class5_8v2 {
    public static String scramble(String word){
        int lenght = word.length();
        int shift = 0;
        String result = word;
        if (lenght > 4){
            shift = (int) Math.random() * 2 + 3;
            result = word.substring(0,1) + word.substring(shift,shift+1) +
                    word.substring(shift,shift+1) + word.substring(shift,shift+1) + word.substring(4,5);

        }
        else{
            result = word.substring(0,1) + word.substring(2,3) + word.substring(1,2) + word.substring(3,4);
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i=1;i<20;i++)
        System.out.println(scramble("place"));
    }
}
