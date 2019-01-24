package com.learning.springDemo;

public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    private FortuneService fortuneService;
    private String emailAddress;
    private String teamName;

//    Getters
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 16 min";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeamName() {
        return teamName;
    }

//    Setters
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeamName(String teamName) {
        System.out.println("CricketCoach: inside setter method - setTeamName");
        this.teamName = teamName;
    }
}