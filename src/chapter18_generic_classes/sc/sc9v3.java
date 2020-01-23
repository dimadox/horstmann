package chapter18_generic_classes.sc;

public class sc9v3 {
    public static Pair<Double, Double> roots (Double x){
        if (x>=0){
            double result = Math.sqrt(x);
            return new Pair<Double, Double>(result, -result);
        }
        else return null;
    }


    public static Pair<Integer, Double> findMax(double[] arr) {
        int imax = 0;
        for (int i = 1; i != arr.length; ++i) {
            if (arr[i] > arr[imax])
                imax = i;
        }

        //return new Pair<Integer, Double>(imax, arr[imax]);
        return new Pair(imax, arr[imax]);
    }



    public static void main(String[] args) {
        Pair p = roots((double)4);
        //Pair<Double, Double> p = roots((double)4);
        System.out.println(p);

        double[] arr = {1, -10, 5, -6, 100.5, 50, -55, -6};
        System.out.println(findMax(arr));

    }


}



