package chapter21_internet_networking.Simple;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) throws IOException {

        //����� ������ �� �� ��������������
        ServerSocket serverSocket = new ServerSocket(8000);

        //������� �����
        serverSocket.accept();
        //����� ����������� ����� ������ ����� ��� �������


    }

}
