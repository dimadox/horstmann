package chapter3;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SelfCheck39 {
    // Logger.getGlobal("m is 1");
    public static void main(String[] args) {


        int m = 1;

        //Logger.getGlobal().setLevel(Level.OFF);



        Logger.getGlobal().info("m is 1");

        System.out.println(m);

        Logger.getGlobal().info("finishing");

    }
}
