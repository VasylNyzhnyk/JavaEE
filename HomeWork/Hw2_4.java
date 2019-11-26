package com.company.HomWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Реализовать метод checkInterval.
 * <p>
 * Метод должен проверять попало ли целое число в интервал от 50 до 100 и сообщить результат
 * на экран в следующем виде: "Число а не содержится в интервале." или "Число а содержится в интервале.",
 * где а - аргумент метода.
 * В этой задаче необходимо использовать &&(и)
 */
public class Hw2_4 {

    public static void main(String[] args) throws IOException {
        System.out.println("Введіть число в інтервалі від 50 до 100 ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        checkInterval(n);

    }

    public static void checkInterval(int n) {

        if (n > 50 && n < 100) {
            System.out.println("Число " + n + " содержится в интервале.");
        } else {
            System.out.println("Число " + n + " не содержится в интервале.");
        }

    }

}
