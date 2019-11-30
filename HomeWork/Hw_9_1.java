package com.company.HomWork;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Сколько дней прошло с начала года/ Используя даты, посчитайте сколько дней прошло
 * с начала года. В этом задание надо использовать set...
 */
public class Hw_9_1 {
    public static void main(String[] args) {
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);
        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);


        Date currentDate = new Date();

        long timeDistance = currentDate.getTime() - yearStartTime.getTime();
        long msDay = 24*60*60*1000;

        System.out.println(timeDistance/msDay);

    }


}
