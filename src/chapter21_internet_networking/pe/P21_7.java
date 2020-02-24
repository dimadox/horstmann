package chapter21_internet_networking.pe;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class P21_7 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://horstmann.com/index.html");
        URLConnection urlConnection = url.openConnection();

        System.out.println("Protocol is " + url.getProtocol());
        System.out.println("Host is " + url.getHost());
        System.out.println("Port is " + url.getPort());
        System.out.println("File is " + url.getFile());

    }
}
