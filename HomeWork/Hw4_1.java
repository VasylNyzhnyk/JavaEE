package com.company.HomWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/*Создайте массив на 10 чисел. Заполните его вводом чисел с клавиатуры,
а после найдите минимальное значение в массиве.*/

public class Hw4_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ar = new int[3];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = Integer.parseInt(reader.readLine());
        }
        int min = ar[0];
        for (int i = 0; i < ar.length; i++) {

            if (min > ar[i])
                min = ar[i];
        }
        System.out.println(min);
    }

}
