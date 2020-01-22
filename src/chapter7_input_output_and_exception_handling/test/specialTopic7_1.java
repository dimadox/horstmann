package chapter7_input_output_and_exception_handling.test;

import java.net.URL;
import java.util.Scanner;

public class specialTopic7_1 {
    public static void main(String[] args) throws java.net.MalformedURLException, java.io.IOException{
        String address = "http://horstmann.com/index.html";
        URL pageLocation = new URL(address);
        Scanner scanner = new Scanner(pageLocation.openStream());
        //System.out.println(scanner);
    }
}
