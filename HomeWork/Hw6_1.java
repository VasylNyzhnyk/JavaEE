package com.company.HomWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/
public class Hw6_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list_in = new ArrayList<>();
        List<Integer> in1 = new ArrayList<>();
        List<Integer> in2 = new ArrayList<>();
        List<Integer> in3 = new ArrayList<>();


//        while(true){
//            String a = reader.readLine();
//            if(a.isEmpty()) break;
//            list_in.add(Integer.parseInt(a));
//        }

        for (int i = 0; i < 20; i++) {
            list_in.add(Integer.parseInt(reader.readLine()));
        }

//        for (int i = 0; i < list_in.size(); i++) {
//            Integer x = list_in.get(i);
//
//            if(x%3==0){
//                in1.add(x);
//            }
//            else if(x%2==0){
//                in2.add(x);
//            }
//            else if (x%3!=0 && x%2!=0){
//                in3.add(x);
//            }
//
//        }

        for (Integer x : list_in) {
            if(x%3==0) in1.add(x);
            else if(x%2==0) in2.add(x);
            else if (x%3!=0 && x%2!=0) in3.add(x);
        }

        printList(in1);
        printList(in2);
        printList(in3);


    }
    public static void printList(List<Integer> list){
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }

}
