package Dao;

import Model.Actor;
import Model.Movie;

import javax.xml.stream.events.EntityReference;
import java.util.ArrayList;
import java.util.List;

public class MovieDaoImp implements MovieDao{

    private  static  MovieDaoImp instance;

    private  List<Movie> movieList;

    private MovieDaoImp(){
        movieList = new ArrayList<>();
    }

    public  static  MovieDaoImp getInstance(){
        if (instance == null){
            instance = new MovieDaoImp();
        }

        return instance;
    }


    @Override
    public Movie getMovieByName(String name) {
        Movie movie = null;

        for (int i = 0; i < movieList.size() && movie == null; i++){
            if (movieList.get(i).getTitulo().equals(name)){
                movie = movieList.get(i);
            }
        }
        return movie;
    }

    @Override
    public List<Movie> getMoviesByDirector(String directorName) {

        List<Movie> movies = new ArrayList<>(0);

        for (Movie movie: movieList) {
            if (movie.getDiretor().getNome().equals(directorName)){
                movies.add(movie);
            }
        }

        return  movies;
    }

    @Override
    public List<Movie> getMoviesByActor(String actorName) {

        List<Movie> movies = new ArrayList<>(0);
        ActorDao actorInstance = ActorDaoImp.getInstance();
        Actor actor = actorInstance.getActorByName(actorName);

        for(Movie movie : movieList){
            if(movie.getElenco().contains(actor)){
                movies.add(movie);
            }
        }

        return  movies;
    }

    @Override
    public List<Movie> getMoviesByNota(int nota) {
        List<Movie> movies = new ArrayList<>(0);

        for(Movie movie : movieList){
            if(movie.getNota() == nota){
                movies.add(movie);
            }
        }
        return  movies;
    }


    @Override
    public boolean insertMovie(Movie movie) {

        if(movie != null){
            for(Movie m : movieList){
                if(m.getTitulo().equals(movie.getTitulo())){
                    return  false;
                }
            }

             movieList.add(movie);
        }

        return  true;
    }

    @Override
    public boolean updateMovie(Movie movie) {
        int index = 0;

        for(Movie m : movieList){
            if (m.getTitulo().equals(movie.getTitulo())){
                movieList.set(index, movie);
                return  true;
            }
            index ++;
        }

        return  false;
    }

    public  boolean isNull(){
        return  movieList == null;
    }

    @Override
    public boolean deleteByTitle(String title) {

        return movieList.remove(findByName(title));

    }

    @Override
    public Movie findByName(String name) {

        for (Movie m : movieList){
            if (m.getTitulo().equals(name)){
                return  m;
            }
        }
        return  null;
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieList;
    }
}
