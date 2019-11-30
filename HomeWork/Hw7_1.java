package com.company.HomWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
  Задача по алгоритмам
 Задача: Написать программу, которая вводит с клавиатуры 10 чисел и сортирует их в убывающем порядке.
 */

public class Hw7_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }

        sort(mas);

        for (int x : mas) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array){  // 5 -34 67 45 90
        for (int i = 0; i < array.length - 1; i++) { // i=0 i<4;
            for (int j = 0; j < array.length - 1 - i; j++) { //j=0 j<4; j=1 j<4;
                if (array[j] < array[j + 1]) {          // 5 < -34; -34 < 67 - true;
                    int temp = array[j];                //  ; temp = -34;
                    array[j] = array[j + 1];            //  ; array[1] = 67;
                    array[j+1] = temp;                  //  ; array[2] = -34;
                }
            }
        }
    }  // 5 67 45 90 -34

}
