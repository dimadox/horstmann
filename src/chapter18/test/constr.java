package chapter18.test;

import java.util.Collection;

public class constr {
    public static <T extends java.util.AbstractList & java.util.List> T qwe(T zxc){
        return zxc;
    }

    public static void main(String[] args) {
        System.out.println(qwe(new java.util.LinkedList<Integer>()));
        System.out.println(qwe(new java.util.ArrayList<Integer>()));
    }


}

