package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import com.stackroute.javaconfig.Appconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
//application
        ApplicationContext ac =new AnnotationConfigApplicationContext(Appconfig.class);
//        Actor actor = ac.getBean(Actor.class);
//        System.out.println(actor);
        Movie mov = ac.getBean(Movie.class);
        System.out.println(mov);
    }
}
