package Dto;

import Model.Entity.Produto;

public class ProdutoDto {
    public String name;
    public String description;
    public int price;
    public int amount;
    public int identifier;

    public ProdutoDto(String name, String description, int price, int amount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
    }
    public ProdutoDto(String name, String description, int price, int amount, int identifier) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
        this.identifier = identifier;
    }

    public ProdutoDto(Produto produto){
        this.name = produto.getNome();
        this.description = produto.getDescricao();
        this.price = produto.getPreco();
        this.amount = produto.getQuantidadeDisp();
        this.identifier = produto.getId();
    }

}
