package chapter21_internet_networking.test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class test5 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);

//        Socket s = serverSocket.accept();
        serverSocket.accept();
    }
}
