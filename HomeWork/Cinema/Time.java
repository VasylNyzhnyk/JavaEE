package com.company.HomWork.Cinema;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Time {
   // Time time = new Time();

    public static int time() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int hour = Integer.parseInt(reader.readLine());
        int min = Integer.parseInt(reader.readLine());
        if (hour > 0 && hour <= 23) {
            System.out.println(hour);
        } else {
            System.out.println("Введений не коректний параметр");
        }
        if (min > 0 && min <= 59) {
            System.out.println(min);
        } else {
            System.out.println("Введений не коректний параметр");
        }
        return time();
    }


}
