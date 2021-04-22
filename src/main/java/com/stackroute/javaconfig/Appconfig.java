package com.stackroute.javaconfig;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Appconfig {

    @Bean
    public Actor actor(){
        return new Actor("varsha","female",24);
    }
    @Bean
    public Actor actor1(){
        return new Actor("keerthana","female",24);
    }

    @Bean
    public Movie movie(){
        List<Actor> act = new ArrayList<Actor>();
        act.add(actor());
        act.add(actor1());
        return new Movie(act);
    }


}
