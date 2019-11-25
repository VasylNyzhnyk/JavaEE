package com.company.HomWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры число n. Вывести на экран надпись «Я буду зарабатывать $n в час».

 Пример:
 Я буду зарабатывать $50 в час
 */
public class Hw2_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        System.out.println("I will be earn  " + n + "$ in hour " );


    }


}
