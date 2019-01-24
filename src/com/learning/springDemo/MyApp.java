package com.learning.springDemo;

public class MyApp {
    public static void main(String[] args) {
        //create the object
        Coach baseballCoach = new BaseballCoach();
        Coach trackCoach = new TrackCoach();
        //use the object
        System.out.println(baseballCoach.getDailyWorkout());
    }
}
