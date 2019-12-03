package com.company.Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/
public class I_NOD {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());
        int j = Integer.parseInt(reader.readLine());
        maxDiv(k,j);//6,12
    }
    public static void maxDiv(int k, int j) {
        int temp = 1;
        int temp1 = 0;

        while (temp <= k && temp <= j) {
            if (k % temp == 0 && j % temp == 0) { //6, 12
                temp1 = temp;
                temp++;
            } else temp++;
        }
        System.out.println(temp1);
    }
}
