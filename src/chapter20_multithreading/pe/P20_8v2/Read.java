package chapter20_multithreading.pe.P20_8v2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;

public class Read implements Runnable{

    private String path = "";
    private static int combinedWordCount = 0;
    private Lock readLock;

    public Read(String path){
        this.path = path;
    }

    public static void read(String path){
        String inputString = "";

            try{
                int countOfSymbols = 0;
                File file = new File(path);
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()){
                    inputString = scanner.nextLine();
                }

                if (inputString.length() != 0) {
                    countOfSymbols++;
                    for (int j = 0; j < inputString.length(); j++) {
                        if (inputString.charAt(j) == ' ') {
                            countOfSymbols++;
                        }
                    }
                }

                Thread.sleep(1000);
                System.out.println(inputString + "  " + countOfSymbols);


                combinedWordCount = combinedWordCount + countOfSymbols;
                System.out.println(combinedWordCount);
            }
            catch (FileNotFoundException exception){

            }
            catch (InterruptedException exception){

            }



    }

    @Override
    public void run() {
        read(path);
    }
}
