package chapter21_internet_networking.test.MyServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Для каждого присоединенного клиента создает новый тред
 */

public class MyServer {
    public static void main(String[] args) throws IOException {
        final int SERVER_PORT = 8888;
        ServerSocket serverSocket = new ServerSocket(SERVER_PORT);

        while (true){
            Socket s = serverSocket.accept();
            Service service = new Service(s);
            Thread t = new Thread(service);
            t.start();
        }
    }
}
