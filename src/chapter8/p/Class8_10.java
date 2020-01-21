package chapter8.p;

import java.util.Scanner;

public class Class8_10 {
    int numberOfDemocrats = 0;
    int numberOfRepublicans = 0;

    public void democrats(){
        numberOfDemocrats++;
    }

    public int getDemocrats(){
        return numberOfDemocrats;
    }

    public void republicans(){
        numberOfRepublicans++;
    }

    public int getRepublicans(){
        return numberOfRepublicans;
    }

    public static void main(String[] args) {
        System.out.println("Enter your vote. 0 for Democrats. 1 for Republicans");
        Scanner scanner = new Scanner(System.in);
        Class8_10 votes = new Class8_10();


        while (scanner.hasNextInt()){
            boolean exitPending = false;
            switch (scanner.nextInt()){
                case 0:
                    votes.democrats();
                    System.out.println("d");
                    break;
                case 1:
                    votes.republicans();
                    System.out.println("r");
                    break;
                default:
                    System.out.println("def");
                    exitPending = true;
                    break;
            }
            System.out.println("democrats = " + votes.getDemocrats() + " republicans = " + votes.getRepublicans());

            if (exitPending)
                break;
        }

        System.out.println("byebye");

    }
}