package chapter1_introduction.reviewExercises;

public class Class18 {
    public static void main(String[] args) {
        int n=3;
        double p=1d;
        // 1 * 10^6 = 1e6
        for (int i=0; i<1e6; i++){
            p = p - 1d / n;
            //1.0
            //1d
            //(double) 1
            // 1 * 10^6
            n = n + 2;
            p = p + ((double) 1 / n);
            n = n + 2;
            // System.out.println(p);
        }
        p=p*4;
        System.out.println(p);
        // data type:
        // 1) values
        // 2) operations on them
        System.out.println(1 / 5);      // int / int (integer division)
        System.out.println(1.0 / 5);    // double / int => (coerce)
                                        // double / double
                                        // 1.0 / 5.0 (real division)
    }
}
