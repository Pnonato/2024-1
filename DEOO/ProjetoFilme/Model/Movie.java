package Model;

import java.util.List;

public class Movie {
    String titulo;
    Director diretor;
    List<Actor> elenco;
    int anoLancamento;
    int nota;

    public Movie(String titulo, Director diretor, int anoLancamento, int nota) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.elenco = elenco;
        this.anoLancamento = anoLancamento;
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Director getDiretor() {
        return diretor;
    }

    public void setDiretor(Director diretor) {
        this.diretor = diretor;
    }

    public List<Actor> getElenco() {
        return elenco;
    }

    public void setElenco(List<Actor> elenco) {
        this.elenco = elenco;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "titulo='" + titulo + '\'' +
                ", diretor=" + diretor +
                ", elenco=" + elenco +
                ", anoLancamento=" + anoLancamento +
                ", nota=" + nota +
                '}';
    }

    public void scanner(Actor actor) {
    }
}
