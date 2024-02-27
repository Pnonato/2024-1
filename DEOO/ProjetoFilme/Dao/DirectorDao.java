package Dao;

import Model.Director;

import java.util.List;

public interface DirectorDao {

    List<Director> getAllDirector();

    Director getDirectorByName(String name);

    void insertDirector(Director director);

    void update(Director oldDirector, Director newDirector);

    void deleteDirector(String name);
}
