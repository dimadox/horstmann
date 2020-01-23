package chapter20_.pe.P20_7v2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadObj {


    public static void read(String path){
        String inputString = "";


        for (int i=0; i<20; i++){
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
            }
            catch (FileNotFoundException exception){

            }
            catch (InterruptedException exception){

            }


        }
    }
}
