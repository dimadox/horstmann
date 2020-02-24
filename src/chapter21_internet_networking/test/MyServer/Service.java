package chapter21_internet_networking.test.MyServer;

import java.net.Socket;

public class Service implements Runnable{
    Socket socket;

    public Service(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("A client was connected");
    }
}
