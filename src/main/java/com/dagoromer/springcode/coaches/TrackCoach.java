package com.dagoromer.springcode.coaches;

import com.dagoromer.springcode.utils.FortuneService;
import com.dagoromer.springcode.utils.MessageService;
import com.dagoromer.springcode.utils.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@PropertySource("classpath:sport.properties")
public class TrackCoach implements Coach {

    private final WorkoutService workoutService;
    private final MessageService messageService;
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

    @Autowired
    public TrackCoach(WorkoutService workoutService,
                      MessageService messageService,
                      FortuneService fortuneService) {
        this.workoutService = workoutService;
        this.fortuneService = fortuneService;
        this.messageService = messageService;
    }

    @Override
    public String getDailyWorkout() {
        return workoutService.getWorkout();
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getRandomMessage() {
        return messageService.getMessage();
    }

    @PostConstruct
    public void initOperation() {
        System.out.println("Starting TrackCoach instance");
    }

    @PreDestroy
    public void finalOperation() {
        System.out.println("Finishing TrackCoach instance");
    }

    @Override
    public String toString() {
        return "TrackCoach{" +
                "email='" + email + '\'' +
                ", team='" + team + '\'' +
                ", hash='" + this.hashCode() + '\'' +
                '}';
    }
}
