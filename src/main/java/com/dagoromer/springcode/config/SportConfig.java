package com.dagoromer.springcode.config;

import com.dagoromer.springcode.coaches.Coach;
import com.dagoromer.springcode.coaches.SwimCoach;
import com.dagoromer.springcode.utils.FortuneService;
import com.dagoromer.springcode.utils.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

}
