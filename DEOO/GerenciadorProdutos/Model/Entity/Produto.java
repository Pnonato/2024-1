package Model.Entity;

import com.sun.source.tree.BreakTree;

public class Produto {

    String nome;
    String descricao;
    int preco;
    int quantidadeDisp;

    int id;

    public void setId(int id) {
        this.id = id;
    }

    public Produto(String nome, String descricao, int preco, int quantidadeDisp, int id) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeDisp = quantidadeDisp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQuantidadeDisp() {
        return quantidadeDisp;
    }

    public void setQuantidadeDisp(int quantidadeDisp) {
        this.quantidadeDisp = quantidadeDisp;
    }

    public int getId(){
        return this.id;
    }

}
