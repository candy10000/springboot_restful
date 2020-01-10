package com.yaxing.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class FileUtils {

    public String ReadFile(String Path) {
        BufferedReader reader = null;
        String laststr = "";
        try {
            URL url = new URL(Path);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream(), "UTF-8");
            reader = new BufferedReader(inputStreamReader);
            String tempString = null;
            int i=1;

            System.out.println("读取文件....");
            while ((tempString = reader.readLine()) != null) {
                laststr += tempString;
            }

            System.out.println("读取文件结束....");

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return laststr;
    }

}