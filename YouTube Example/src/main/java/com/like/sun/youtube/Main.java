package com.like.sun.youtube;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        String content = scanner.next();

        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser.parse(search("이하이 홀로"));
        } catch (ParseException e) {
            System.out.println("Parse 예외 발생!");
        }

        if (obj == null) {
            System.out.println("obj null");
            return;
        }

        JSONObject jsonObject = (JSONObject) obj;
        Collection collection = jsonObject.values();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //System.out.println(jsonObject.get("snippet"));
    }

    public static String search(String search) throws IOException {

        String apiurl = "https://www.googleapis.com/youtube/v3/search";
        apiurl += "?key=AIzaSyAGWOYDPwcoSSkC7ck2eLZNulFRHLx_VMo";
        apiurl += "&part=snippet&type=video&maxResults=20&videoEmbeddable=true";
        apiurl += "&q=" + URLEncoder.encode(search, "UTF-8");

        URL url = new URL(apiurl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = br.readLine()) != null) {
            response.append(inputLine);
        }
        br.close();

        return response.toString();
    }
}