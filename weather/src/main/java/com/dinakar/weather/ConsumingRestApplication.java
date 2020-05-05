package com.dinakar.weather;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ConsumingRestApplication {

    public static Map<String, Object> jsonToMap(String str) {
        Map<String, Object> map = new Gson().fromJson(str, new TypeToken<HashMap<String, Object>>() {
        }.getType());
        return map;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter valid Latitude");
    String Latitude = sc.next();
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter valid Longitude");
    String Longitude = sc1.next();
    
        String urlString = "https://api.darksky.net/forecast/0b67f8f549800f7bdeccc85500ba9324/" + Latitude + "," + Longitude;
    //https://api.darksky.net/forecast/0b67f8f549800f7bdeccc85500ba9324/42.335190,-83.049190
    System.out.println(urlString);
    try {
      StringBuilder result = new StringBuilder();
      URL url = new URL(urlString);
      URLConnection conn = url.openConnection();
      BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      String line;
      while ((line = br.readLine()) != null) {
        result.append(line);
      }
      br.close();
      System.out.println(result);
      Map<String, Object> respMap = jsonToMap(result.toString());
      Map<String, Object> mainMap = jsonToMap(respMap.get("main").toString());
      Map<String, Object> windMap = jsonToMap(respMap.get("wind").toString());
      System.out.println(mainMap.get("temp"));
//      System.out.println(mainmap.get());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

}
