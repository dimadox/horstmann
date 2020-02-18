package chapter21_internet_networking.Simple;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) throws IOException {

        //сокет создан но не прослушивается
        ServerSocket serverSocket = new ServerSocket(8000);

        //слушаем сокет
        serverSocket.accept();
        //после подключения будет создан сокет для клиента


    }

}
