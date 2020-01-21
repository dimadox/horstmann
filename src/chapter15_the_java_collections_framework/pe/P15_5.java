package chapter15_the_java_collections_framework.pe;

import java.util.Scanner;
import java.util.Stack;

public class P15_5 {
    public static void main(String[] args) {
        Stack<Integer> driveway = new Stack<Integer>();
        Stack<Integer> street = new Stack<Integer>();
        System.out.println("Input a command and car number");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "add": //addDriveway
                    driveway.push(scanner.nextInt());
                    break;
                case "remove": //removeDriveway
                    driveway.pop();
                    break;
                case "d2s":  //driveway2street
                    street.push(driveway.pop());
                    break;
                case "s2d": //street2driveway
                    driveway.push(street.pop());
                    break;
                default:
                    System.out.println("Command not found");
                    break;
            }


            System.out.println("Driveway contains: " + driveway);
            System.out.println("Street contains: " + street);
        }

    }
}
