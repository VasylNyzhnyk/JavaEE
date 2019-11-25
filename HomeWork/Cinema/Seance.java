package com.company.HomWork.Cinema;


public class Seance {
    String Movie;
    int startTime;

    public String getMovie() {
        return Movie;
    }

    public int getTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

   private int endTime;


    public Seance(String movie, int time) {
        Movie = movie;
        this.startTime = time;
    }
}
