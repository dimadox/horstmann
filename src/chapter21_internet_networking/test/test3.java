package chapter21_internet_networking.test;

import java.io.IOException;
import java.net.ServerSocket;

public class test3 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);
        serverSocket.accept();
        serverSocket.close();
    }
}
