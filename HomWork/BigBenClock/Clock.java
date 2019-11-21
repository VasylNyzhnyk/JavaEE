package com.company.HomWork.BigBenClock;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Created by Pc on 01.01.2017.
 *//* Big Ben clock
1. В выполняющем классе создать приватную переменную isStopped, присвоить ей значение false
2. Создать класс Clock, унаследовать его от Thread
3. В классе Clock:
- создать параметры cityName, hours, minutes, seconds - пдумать, какой тип у каждого параметра
- создать конструктор и инициализировать все параметры класса, так же запустить нить в конструкторе
- создать и реализовать логику метода printTime так, чтобы каждую секунду выдавалось время начиная с установленного в конструкторе
Пример:
В г. Лондон сейчас 23:59:58!
В г. Лондон сейчас 23:59:59!
В г. Лондон сейчас полночь!
В г. Лондон сейчас 0:0:1!
- создать метод run:
 -- пока переменная isStopped равняется false выполнять метод printTime;
 -- отлавливать все checked исключения.
4. В выполняющем методе:
- создать объект класса Clock
- отправить главную нить в сон на 4 секунды
- поменять значение переменной isStopped на true
- отправить главную нить в сон на 1 секунду
*/
public class Clock extends Thread {
    String cityName;
    int hours;
    int minutes;
    int seconds;


    public Clock(String cityName, int hours, int minutes, int seconds) {
        this.cityName = cityName;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        start();
    }

    public void printTime() throws InterruptedException {
        Thread.sleep(1000);
        seconds++;
        if (hours == 23 && minutes == 59 && seconds == 60) {
            hours = 0;
            minutes = 0;
            seconds = 0;
        } else if (seconds == 60) {
            seconds = 0;
            minutes++;
        } else if (minutes == 60) {
            minutes = 0;
            hours++;
        }
        if (hours == 0 && minutes == 0 && seconds == 0) {
            System.out.println("В г. " + cityName + " сейчас полночь!");
        } else {
            System.out.println("В г." + cityName + " сейчас " + hours + ":" + minutes + ":" + seconds + "!");

        }
    }
    @Override
    public void run() {
        while (!Solution.isStopped) {
            {
                try {
                    printTime();
                } catch (InterruptedException e) {

                }
            }

        }
    }
}
