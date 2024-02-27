package Controller;

import Dto.ProdutoDto;
import Model.Entity.Produto;
import Model.Service.ProdutoService;

import java.util.ArrayList;
import java.util.List;

public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController (){
        this.service = new ProdutoService();
    }

    public boolean addProduto(ProdutoDto newProduto){
            return service.addProduto(new Produto(newProduto.name, newProduto.description, newProduto.price,newProduto.amount,newProduto.identifier));


    }

    public boolean removeProduto(int id){
        return service.removeProduto(id);
    }

    public boolean attProduct(int identifier, ProdutoDto newProduct){
        return service.attProduto(
                identifier,
                new Produto(
                        newProduct.name,
                        newProduct.description,
                        newProduct.price,
                        newProduct.amount,
                        newProduct.identifier
                )
        );
    }

    public List<ProdutoDto> getAllProducts(){
        List<ProdutoDto> productDtos = new ArrayList<>();
        for (Produto product : service.getAllProducts()){
            productDtos.add(new ProdutoDto(product));
        }

        return productDtos;
    }
}
