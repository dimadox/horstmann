package chapter21_internet_networking.pe;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class P21_1v2 {
    public static void main(String[] args) throws IOException {
        int HTTP_PORT = 80;
        String resource = "/";
        String host = "horstmann.com";
        ArrayList<String> arrayList = new ArrayList<>();
        boolean check = true;

        Socket s = new Socket(host, HTTP_PORT);

        InputStream inputStream = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();

        Scanner scanner = new Scanner(inputStream);
        PrintWriter printWriter = new PrintWriter(outputStream);

        String command = "GET " + resource + " HTTP/1.1\n" + "Host: " + host + "\n\n";

        printWriter.print(command);
        printWriter.flush();

        while (scanner.hasNextLine()){
            arrayList.add(scanner.nextLine());
        }



        for (String i : arrayList){
            if (!i.isEmpty()){
                System.out.println(i);
            }
            else break;

        }
    }
}
