package com.company.HomWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Hw_12 {
    public static void main(String[] args) throws IOException {
        Map<String, String> stringMap = stringCityMap();
        System.out.println(getCity1(stringMap));

    }

    public static Map<String, String> stringCityMap() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> stringMap = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String lastName = reader.readLine();
            stringMap.put(city, lastName);

        }
        return stringMap;
    }

    public static String getCity1(Map<String, String> stringMap) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String city1 = reader.readLine();
        String lastName = null;
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            if(entry.getKey().toLowerCase().equals(city1.toLowerCase()) ){
                lastName = entry.getValue();
            }
        }return lastName;
    }
}