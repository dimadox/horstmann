package chapter21_internet_networking.pe.v2.P21_5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8898);

        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        Scanner scanner = new Scanner(inputStream);
        PrintWriter printWriter = new PrintWriter(outputStream);

        Scanner s1 = new Scanner(System.in);


        printWriter.print(s1.nextInt());
        printWriter.println();
        printWriter.flush();

        System.out.println(scanner.nextInt());


    }
}
