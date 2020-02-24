package chapter21_internet_networking.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLConnections {
    public static void main(String[] args) throws IOException {
        String urlString;

        if (args.length == 1){
            urlString = args[0];
        }
        else {
            urlString = "http://horstmann.com";
            System.out.println("Using " + urlString);
        }

        //Открытие соединения
        URL u = new URL(urlString);
        URLConnection connection = u.openConnection();

        HttpURLConnection httpURLConnection = (HttpURLConnection) connection;
        int code = httpURLConnection.getResponseCode();

        String message = httpURLConnection.getResponseMessage();
        System.out.println(code + " " + message);

//        if (code != HttpURLConnection.HTTP_OK){
//            return;
//        }

        //Получение входного потока
        InputStream inputStream = connection.getInputStream();
        Scanner scanner = new Scanner(inputStream);

//
//        OutputStream outputStream = connection.getOutputStream();
//        PrintWriter printWriter = new PrintWriter(outputStream);


//        while (scanner.hasNextLine()){
//            String input = scanner.nextLine();
//            System.out.println(input);
//        }
    }
}
