package Dao;

import Model.Actor;

import java.util.List;

public interface ActorDao {

    List<Actor> getAllActors();
    Actor getActorByName(String name);

    void insertActor(Actor actor);

    void updateByName(String name, Actor actor);

    void deleteActor(String name);
}
