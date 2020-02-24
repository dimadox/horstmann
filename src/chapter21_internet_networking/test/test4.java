package chapter21_internet_networking.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("horstmann.com", 80);

        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        Scanner scanner = new Scanner(inputStream);
        PrintWriter printWriter = new PrintWriter(outputStream);

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}
