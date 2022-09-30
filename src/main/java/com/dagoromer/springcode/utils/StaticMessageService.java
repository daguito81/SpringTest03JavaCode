package com.dagoromer.springcode.utils;

import org.springframework.stereotype.Component;

@Component
public class StaticMessageService implements MessageService{
    @Override
    public String getMessage() {
        return "This is a random message!";
    }
}
