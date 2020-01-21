package chapter18.sc;

public class sc9 {
    public static Pair<Double, Double> roots (Double x){
        if (x>=0){
            double result = Math.sqrt(x);
            return new Pair<Double, Double>(result, -result);
        }
        else return null;
    }






    public static void main(String[] args) {
        Pair p = roots((double)4);
        System.out.println(p);



    }


}



