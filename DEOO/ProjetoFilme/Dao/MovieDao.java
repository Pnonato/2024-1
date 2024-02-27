package Dao;

import Model.Movie;

import java.util.List;

public interface MovieDao {

    boolean insertMovie(Movie movie);

    boolean updateMovie(Movie movie);

    boolean deleteByTitle(String title);

    Movie findByName(String name);

    List<Movie> getAllMovies();

    List<Movie> getMoviesByDirector(String directorName);
    List<Movie> getMoviesByActor(String actorName);
    List<Movie> getMoviesByNota(int nota);

  Movie getMovieByName(String name);

}
