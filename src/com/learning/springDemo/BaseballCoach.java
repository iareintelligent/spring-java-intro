package com.learning.springDemo;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    public BaseballCoach() {}

    @Override
    public String getDailyWorkout() {
        return "Spend 30min on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
