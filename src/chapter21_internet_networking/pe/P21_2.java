package chapter21_internet_networking.pe;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class P21_2 {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("http://horstmann.com/index.html");
        URLConnection urlConnection = url.openConnection();

        InputStream inputStream = urlConnection.getInputStream();

        HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;

    }

}
