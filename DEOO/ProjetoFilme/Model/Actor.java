package Model;

public class Actor {

    private String name;
    private  int idade;


    public Actor(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Actor { " +
                " name = '" + name + '\'' +
                ", idade = " + idade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
