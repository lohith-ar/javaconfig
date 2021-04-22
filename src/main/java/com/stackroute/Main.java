package com.stackroute;

import com.stackroute.domain.Actor;
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

        ApplicationContext ac =new AnnotationConfigApplicationContext(Appconfig.class);
        Actor actor = ac.getBean(Actor.class);
        System.out.println(actor);
    }
}
