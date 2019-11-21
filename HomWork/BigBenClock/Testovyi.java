package com.company.HomWork.BigBenClock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Pc on 19.01.2017.
 *//*менше число*/
public class Testovyi {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int temp;
        temp = a < b ? b : a;
        System.out.println(temp);
    }
}
