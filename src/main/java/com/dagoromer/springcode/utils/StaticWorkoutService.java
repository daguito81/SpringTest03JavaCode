package com.dagoromer.springcode.utils;

import org.springframework.stereotype.Component;

@Component
public class StaticWorkoutService implements WorkoutService{
    @Override
    public String getWorkout() {
        return "Do 30 minutes of cardio!";
    }
}
