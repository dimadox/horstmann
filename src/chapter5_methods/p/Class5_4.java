package chapter5_methods.p;

public class Class5_4 {
    public static String middle(String str) {
        int i = str.length();
        if (i%2 == 0){
            return str.substring(i/2-1, i/2+1);
        }
        else{
            return str.substring(Math.round(i/2), Math.round(i/2)+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(middle("qwe"));

        //System.out.print(Math.round(7/2));
    }
}
