package chapter20.pe.P20_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadObj {


    public static void read(String path){
        String out = "";

        for (int i=0; i<20; i++){
            try{
                File file = new File(path);
                Scanner scanner = new Scanner(file);
                out = scanner.nextLine();
                Thread.sleep(1000);
            }
            catch (FileNotFoundException exception){

            }
            catch (InterruptedException exception){

            }

            System.out.println(out);
        }

    }




}
