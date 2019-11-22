package com.company.HomWork.Cinema;

import java.util.Map;
import java.util.TreeMap;

/*Даний проект має такі сутності: Days, Time, Movie, Seance, Schedule, Cinema.
enum Days:
  - прописати дні тижня;
Time:
    - int min, int hour;
    - передбачити межі для цих полів (для min 0..59, для hour 0..23);
Movie:
   - String title, Time duration;
Seance:
   - Movie movie, Time startTime, Time endTime;
   - в конструктор має надходити параметрами значення для перших двох полів, третє поле повинне обчислюватись (start + duration);
Schedule:
   - TreeSet <Seance> (в полі пишемо Set <Seance>, а в конструкторі вже =new TreeSet <Seance>() );
   - методи: addSeance (Seance), removeSeance (Seance);
Cinema:
   - TreeMap<Days, Schedule>, Time open, Time close;
   - врахувати час відкриття і закриття при формуванні сеансів!
   - методи: addMovie (Movie, Seacne...seance) (додає фільм і зразу ж набір сеансів), addSeance (Seance, String),
    removeMovie(Movie) (повністю видаляє фільм з розкладу), removeSeance (Seance, String) (видаляє конкретний сеанс фільму
    в конкретний день, який задається параметром String).
Main class:
   - створення об'єкту Cinema;
   - реалізовує меню, в якому виконується весь функціонал Cinema.
Для кожного класу зробити адекватний toString, щоб все було читабельно і доступно. Супроводжуючі повідомлення і
тому подібне. Там де потрібно, зробити compareTo(). */
public class Cinema {
    Map<Days,Schedule> daysSchedule = new TreeMap<>();

    public static String timeOpen(){
        return "Кінотеатр працює з 8:00 год";
    }
    public static String timeClose(){
        return "Кінотеатр працює до 23:00 год";
    }

}

































