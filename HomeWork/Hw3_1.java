package com.company.HomWork;

/**
 * Created by user on 18.09.2016.
 */
/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888;

8888
888
88
8
...
*/
public class Hw3_1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++ ) {
            for (int j = 0; j < i; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
