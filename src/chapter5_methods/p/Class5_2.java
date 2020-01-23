package chapter5_methods.p;

public class Class5_2 {
    public static boolean allTheSame(double x, double y, double z) {
        if ((x==y) && (y==z)){
            return true;
        }
        else return false;
    }


    public static void main(String[] args) {
        System.out.print(allTheSame(1,1,1));

    }

}
