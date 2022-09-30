package com.dagoromer.springcode;

import com.dagoromer.springcode.coaches.Coach;
import com.dagoromer.springcode.config.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);
        Coach theCoach = context.getBean("swimCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getRandomMessage());
        System.out.println(theCoach);
    }
}