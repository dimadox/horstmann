package chapter18.pe;

import chapter18.sc.Pair;

public class P18_3 {
    public static <T, S> Pair PairUtil(Pair pair){
        T first = (T) pair.getFirst();
        S second = (S) pair.getSecond();
        Pair<T, S> returnPair = new Pair<T, S>(first, second);
        return returnPair;
    }

    public static void main(String[] args) {
        Pair<String, String> pair = new Pair<>("qwe", "zxc1");
        System.out.println(PairUtil(pair));

    }

}
