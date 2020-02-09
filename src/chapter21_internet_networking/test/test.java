package chapter21_internet_networking.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        int HTTP_PORT = 80;
        Socket s = new Socket("horstmann.com", HTTP_PORT);

        InputStream inputStream = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();

        Scanner scanner = new Scanner(inputStream);
        PrintWriter printWriter = new PrintWriter(outputStream);

        printWriter.print("GET");
        printWriter.flush();





    }
}
