package chapter21_internet_networking.pe.v2.P21_5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8898);
        Service service = new Service(0);

        System.out.println("hop");

        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        Scanner scanner = new Scanner(inputStream);
        PrintWriter printWriter = new PrintWriter(outputStream);


        System.out.println("2");
        int res = scanner.nextInt() * 10;
        System.out.println(res);
        printWriter.print(res);
        printWriter.flush();

        socket.close();


    }
}
