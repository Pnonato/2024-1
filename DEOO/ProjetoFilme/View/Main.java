package View;

import Dao.ActorDaoImp;
import Dao.DirectorDaoImp;
import Dao.MovieDaoImp;
import Model.Actor;
import Model.Director;
import Model.Movie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final String pageChanger = "========== / =========";

        DirectorDaoImp directorDaoImp = DirectorDaoImp.getInstance();
        MovieDaoImp movieDaoImp = MovieDaoImp.getInstance();
        ActorDaoImp actorDaoImp = ActorDaoImp.getInstance();


        Integer opcao;
        do {
            System.out.println(pageChanger);
            System.out.println("MENU PRINCIPAL");
            System.out.println("0 - SAIR");
            System.out.println("1 - CADASTRAR FILME");
            System.out.println("2 - LISTAR TODOS FILMES CADASTRADOS");
            System.out.println("3 - LISTAR TODOS OS DIRETORES CADASTRADOS");
            System.out.println("4 - LISTAR TODOS OS ATORES CADASTRADOS");
            System.out.println("5 - LISTAR FILMES POR DIRETOR");
            System.out.println("6 - LISTAR FILMES POR ATOR");
            System.out.println("7 - LISTAR FILMES POR NOTA");
            System.out.println();
            System.out.println();

            System.out.println("Digite a opção");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println(pageChanger);
                    scanner.nextLine();
                    System.out.println("CADASTRO DO FILME");
                    System.out.print("Titulo do filme: ");
                    String title = scanner.nextLine();
                    System.out.print("Ano de lançamento: ");
                    int year = scanner.nextInt();
                    System.out.print("Numero de estrelas: ");
                    int mark = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Diretor do filme: ");
                    String director = scanner.nextLine();

                    Movie movie = new Movie(title, new Director(director), year, mark);

                    String name;
                    int birthday;

                    do {
                        System.out.println("Insira o nome do ator: ");
                        name = scanner.nextLine();
                        if (!name.isEmpty()) {
                            System.out.println("Data de nascimento: ");
                            birthday = scanner.nextInt();
                            movie.scanner(new Actor(name, birthday));
                            System.out.println("Para finalizar, deixe o nome do ator em " +
                                    "branco.\n");
                            scanner.nextLine();
                        }
                    } while (!name.isEmpty());

                    break;

                case 2:
                    if (!movieDaoImp.isNull()) {
                        System.out.println("\nFILMES: \n");
                        for (Movie movie1 : movieDaoImp.getAllMovies()) {
                            System.out.println(movie1.toString());
                            System.out.println();
                        }
                    } else {
                        System.out.println("Não há filmes a serem " +
                                "listados.");
                    }

                    break;

                case 3:
                    if (!directorDaoImp.isNull()) {
                        System.out.println("\nDIRETORES: \n");
                        for (Director director1 : directorDaoImp.getAllDirector()) {
                            System.out.println(director1.getNome());
                        }
                    } else {
                        System.out.println("Não há diretores a serem " +
                                "listados.");
                    }
                    break;

                case 4:
                    if (!actorDaoImp.isNull()) {
                        System.out.println("\nATORES: \n");
                        for (Actor actor : actorDaoImp.getAllActors()) {
                            System.out.println(actor.getName() + " (" + actor.getIdade() + ")");
                        }
                    } else {
                        System.out.println("Não há atores a serem " +
                                "listados.");
                    }
                    break;

                case 5:
                    String diretor = "Diretor";
                    if (!movieDaoImp.getMoviesByDirector(diretor).isEmpty()) {
                        System.out.println("FILMES DO DIRETOR " + diretor.toUpperCase() + ":\n");
                        for (Movie movie1 :
                                movieDaoImp.getMoviesByDirector(diretor)) {
                            System.out.println(movie1.toString());
                            System.out.println();
                        }
                    } else {
                        System.out.println("Esse diretor não possui filmes " +
                                "cadastrados.");
                    }
                    break;


                case 6:
                    String actor = ("ator");
                    if (!movieDaoImp.getMoviesByActor(actor).isEmpty()) {
                        System.out.println("\nFILMES DO ATOR " + actor.toUpperCase() + ":\n");
                        for (Movie movie1 :
                                movieDaoImp.getMoviesByActor(actor)) {
                            System.out.println(movie1.toString());
                            System.out.println();
                        }
                    } else {
                        System.out.println("Esse ator não possui filmes " +
                                "cadastrados.");
                    }
                    break;


                case 7:
                    System.out.println("Digite a nota");
                    mark = scanner.nextInt();
                    if (!movieDaoImp.getMoviesByNota(mark).isEmpty()) {
                        System.out.println("\nFILMES COM NOTA " + mark + ":\n");
                        for (Movie movie1 :
                                movieDaoImp.getMoviesByNota(mark)) {
                            System.out.println(movie1.toString());
                            System.out.println();
                        }
                    } else {
                        System.out.println("Não há filmes cadastrados com " +
                                "essa nota no momento.");
                    }
                    break;

                case 8:
                    break;
            }


        } while (opcao != 8);

    }

}
