package chapter21_internet_networking.pe;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

public class P21_2 {
    public static void main(String[] args) throws IOException {
        int PORT = 80;
        String message = "GET " + "/" + " HTTP/1.1\n" + "Host: " + "horstmann.com" + "\n";
        Socket socket = new Socket("horstmann.com", PORT);

        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        Scanner scanner = new Scanner(inputStream);
        PrintWriter printWriter = new PrintWriter(outputStream);

        printWriter.print(message);
        printWriter.flush();

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }


    }

}
