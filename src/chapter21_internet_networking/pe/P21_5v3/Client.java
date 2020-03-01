package chapter21_internet_networking.pe.P21_5v3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8888);

        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        Scanner scanner = new Scanner(inputStream);
        PrintWriter printWriter = new PrintWriter(outputStream);
        // printWriter.flush();

        Scanner keyboardScanner = new Scanner(System.in);
        while (keyboardScanner.hasNextInt()){
            int x= keyboardScanner.nextInt();
            printWriter.print(x+"\n");
            System.out.println("sent " + x);
            printWriter.flush();

            System.out.println(scanner.nextInt());
        }

        socket.close();

    }
}
