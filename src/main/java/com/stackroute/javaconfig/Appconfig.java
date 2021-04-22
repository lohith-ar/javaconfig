package com.stackroute.javaconfig;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

    @Bean
    public Actor actor(){
        return new Actor();
    }

    @Bean
    public Movie movie(){
        return new Movie();
    }


}
