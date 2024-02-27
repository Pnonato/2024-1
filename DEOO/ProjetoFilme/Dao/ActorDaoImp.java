package Dao;

import Model.Actor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class ActorDaoImp implements ActorDao {

    private  static  ActorDaoImp instance;

    private List<Actor> actorList;

    private  ActorDaoImp(){

        actorList = new ArrayList<>();
    }

    public  static  ActorDaoImp getInstance(){
        if (instance == null){
            instance = new ActorDaoImp();
        }

        return  instance;
    }


    public  boolean isNull(){
        return  actorList == null;
    }
    @Override
    public List<Actor> getAllActors() {
        return actorList;
    }

    @Override
    public Actor getActorByName(String name) {

        for(Actor a : actorList){
            if (a.getName().equals(name)){
                return  a;
            }
        }

        return  null;
    }

    @Override
    public void insertActor(Actor actor) {
        if(actor != null){
            if (getActorByName(actor.getName()) == null){
                actorList.add(actor);
            }
        }
    }

    @Override
    public void updateByName(String name, Actor actor) {

            int index = 0;

            for (Actor a : actorList){

                if(a.getName().equals(name)){
                    actorList.set(index, actor);
                }

                index ++;
            }
    }

    @Override
    public void deleteActor(String name) {

        for (Actor a : actorList){
            if (a.getName().equals(name)){
                actorList.remove(a);
                return;
            }
        }
    }
}
