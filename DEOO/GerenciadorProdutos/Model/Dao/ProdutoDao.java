package Model.Dao;

import Model.Entity.Produto;

import java.util.List;

public interface ProdutoDao {
    List<Produto> findAll();

    boolean insert(Produto produto);

    boolean uptade(int id, Produto newProduto);

    boolean delete(int id);
}
