package com.company.HomWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Массив из строчек в обратном порядке
 * 1. Создать массив на 10 строчек.
 * 2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
 * 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
 */
public class Hw5_1 {
    public static void main(String[] args) throws IOException {
        String[] array = initialyzeArray();
        print(array);
    }

    public static String[] initialyzeArray() throws IOException {
        String[] str = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < str.length - 2; i++) {
            str [i] = reader.readLine();
        }
        return str;
    }

    public static void print(String[] a){
        for (int i = 9; i >=1 ; i--) {
            System.out.println(a[i]);
        }
    }

}
