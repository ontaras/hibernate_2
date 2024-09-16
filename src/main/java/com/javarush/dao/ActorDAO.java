package com.javarush.dao;

import org.hibernate.SessionFactory;
import com.javarush.domain.Actor;

public class ActorDAO extends GenericDAO<Actor> {
    public ActorDAO(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}