package Tests;

import javax.swing.*;
import java.util.Scanner;

public class TestChapter1 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter­price:");
        double price = Double.parseDouble(input);
        price = price - 2;
        JOptionPane.showMessageDialog (null, "Price:" + price);


        //System.out.println ( "Please enter your name:");
        //Scanner in = new Scanner(System.in);
        //String name = in.next ();
        //System.out.println(name);


    }
}
