package com.dagoromer.springcode.coaches;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

    @Override
    public String getRandomMessage() {
        return null;
    }
}
