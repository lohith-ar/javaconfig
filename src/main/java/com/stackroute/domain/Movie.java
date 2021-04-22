package com.stackroute.domain;

import com.stackroute.domain.Actor;

import java.util.List;

public class Movie {

    List<Actor> actor;

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    public List<Actor> getActor() {
        return actor;
    }

    public void setActor(List<Actor> actor) {
        this.actor = actor;
    }
}

