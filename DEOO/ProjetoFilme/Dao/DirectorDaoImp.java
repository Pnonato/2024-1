package Dao;

import Model.Director;

import java.util.ArrayList;
import java.util.List;

public class DirectorDaoImp implements DirectorDao{

    private  static  DirectorDaoImp instance;

    private List<Director> directorList;

    private  DirectorDaoImp(){
        directorList = new ArrayList<>();
    }


    public  static  DirectorDaoImp getInstance(){

        if (instance == null){
            instance = new DirectorDaoImp();
        }

        return  instance;
    }




    @Override
    public List<Director> getAllDirector() {
        return directorList;
    }

    @Override
    public Director getDirectorByName(String name) {

        for (Director d : directorList){
            if (d.getNome().equals(name)){
                return  d;
            }
        }
        return  null;
    }

    @Override
    public void insertDirector(Director director) {

        if (director != null){

            for(Director d : directorList){
                if (d.getNome().equals(director.getNome())){
                    return;
                }
            }
            directorList.add(director);
        }
    }

    public  boolean isNull(){
        return  directorList == null;
    }

    @Override
    public void update(Director oldDirector, Director newDirector) {

            Director inList = getDirectorByName(oldDirector.getNome());
            inList.setNome(newDirector.getNome());
    }

    @Override
    public void deleteDirector(String name) {

      directorList.remove(getDirectorByName(name));

    }
}
