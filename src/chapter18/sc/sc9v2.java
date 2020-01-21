package chapter18.sc;

public class sc9v2 {
    public Pair<Double, Double> roots (Double x){
        if (x>=0){
            double result = Math.sqrt(x);
            return new Pair<Double, Double>(result, -result);
        }
        else return null;
    }






    public static void main(String[] args) {
        sc9v2 obj = new sc9v2();
        Pair p = obj.roots((double)4);
        System.out.println(p);

    }


}



