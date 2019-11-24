package com.company.HomWork;

/**
 * Релизовать метод private static void swap, который меняет две переменные местами и выводит их на экран.
 Например int m = 5;
 int n = 6;
 Должны стать м = 6 и н = 5
 */
public class Hw01_02 {

    public static void main(String[] args) {

        swap(8,9);
    }

   private static void swap (int m, int n){
       int temp = m;
         m = n;
        n = temp;
       System.out.println(m +  "  "   + n);
    }

}
