package com.company.HomWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Реализовать метод closeToTen.
 * Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в
 * аргументах метода.Например, среди чисел 8 и 11 ближайшее к десяти 11.
 * Если оба числа на равной длине к 10, то вывести на экран любое из них.
 * Вам надо отнимать - 10 от чисел, которые приходят в метод, а потом сравнивать остаток в иф элс)
 */
public class Hw2_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(reader.readLine());
        int i2 = Integer.parseInt(reader.readLine());
        closeToTen(i1 , i2 ); // 4 7
    }

    public static void closeToTen(int i1, int i2) {
        int temp1 = abs(10 - i1); // 6
        int temp2 = abs(10 - i2); // 3

        if(temp1 < temp2){
            System.out.println(i1);
        } else {
            System.out.println(i2);
        }

    }

    public static int abs(int a){
        if(a < 0){
            return - a;
        } else {
            return a;
        }
    }
}
