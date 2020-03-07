package chapter21_internet_networking.pe.P21_4.Bank;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class BankClient {
    public static void main(String[] args) throws IOException {
        final int SBAP_PORT = 8888;
        Socket s = new Socket("localhost", SBAP_PORT);
        InputStream inputStream = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();

        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        String command = "DEPOSIT 3 1000\n";
        System.out.println("Sending: " + command);
        out.print(command);
        out.flush();
        String response = in.nextLine();
        System.out.println("Receiving: " + response);

        command = "WITHDRAW 3 500\n";
        System.out.print("Sending: " + command);
        out.print(command);
        out.flush();
        response = in.nextLine();
        System.out.println("Receiving: " + command);

        command = "QUIT\n";
        System.out.println("Sending: " + command);
        out.print(command);
        out.flush();



        s.close();

    }
}
