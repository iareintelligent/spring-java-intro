package com.learning.springDemo;

public class DatingCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Get it, fam";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
