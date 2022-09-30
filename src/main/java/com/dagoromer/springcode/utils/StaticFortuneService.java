package com.dagoromer.springcode.utils;

import org.springframework.stereotype.Component;

@Component
public class StaticFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
