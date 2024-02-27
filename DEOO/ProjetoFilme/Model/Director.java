package Model;

public class Director {

    String nome;

    public Director(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Director { " +
                " nome = '" + nome + '\'' +
                '}';
    }
}
