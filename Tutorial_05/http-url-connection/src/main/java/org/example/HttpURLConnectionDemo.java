package org.example;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionDemo {

    public static void main(String[] args) {

        try{
            URL url = new URL("https://www.booking.com/");
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();

            for(int i=1; i<=8; i++){
                System.out.println(huc.getHeaderFieldKey(i) + " = " + huc.getHeaderField(i));
            }

            huc.disconnect();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}