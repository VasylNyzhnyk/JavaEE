package com.company.HomWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры 4 числа и найти максимальное среди них.
 */
public class Hw2_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        int n4 = Integer.parseInt(reader.readLine());


             /* if(n1 > n2 && n1 > n3){
            System.out.println("Max is " + n1);
        }else if(n2 > n1 && n2 > n3){
            System.out.println("Max is " + n2);
        }else if(n3 > n2 && n3 > n1){
            System.out.println("Max is " + n3);
        }else if(n4 > n3 && n4 > n1) {
            System.out.println("Max is " + n4);
              }
*/


              if(n1 > n2 && n1 > n3 && n1 > n4){
            System.out.println("Max is " + n1);
        }else if(n2 > n1 && n2 > n3 && n2 > n4 ){
            System.out.println("Max is " + n2);
        }else if(n3 > n2 && n3 > n1 && n3 > n4){
            System.out.println("Max is " + n3);
        }else if(n4 > n3 && n4 > n1 && n4 > n2) {
                  System.out.println("Max is " + n4);
              }

    }
}
