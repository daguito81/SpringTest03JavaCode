package com.dagoromer.springcode.coaches;

import com.dagoromer.springcode.utils.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
    // We will create this bean without using Annotations
    private final FortuneService fortuneService;
    private String email;
    private String team;

    @Value("${prop.email}")
    public void setEmail(String email) {
        this.email = email;
    }

    @Value("${prop.team}")
    public void setTeam(String team) {
        this.team = team;
    }

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim a lot!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getRandomMessage() {
        return "Random Message!";
    }

    @Override
    public String toString() {
        return "SwimCoach{" +
                "email='" + email + '\'' +
                ", team='" + team + '\'' +
                ", hash='" + this.hashCode() + '\'' +
                '}';
    }
}
