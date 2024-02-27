package Model.Service;

import Model.Dao.ProdutoDao;
import Model.Dao.ProdutoDaoImp;
import Model.Entity.Produto;

import java.util.List;

public class ProdutoService {

    private final ProdutoDao produtoDao;

    int id;

    public ProdutoService(){
        produtoDao = ProdutoDaoImp.getInstance();
        id = 1;
    }

    public boolean addProduto(Produto produto){
        if(produto!=null){
            if(produtoDao.insert(produto)){
                AddID();
                return true;
            }
        }

        return false;
    }

    public boolean removeProduto(int id){
        if (id > 0){
            return produtoDao.delete(id);
        }

        return false;
    }

    public boolean attProduto(int id, Produto newProduto){
        if (id > 0 && newProduto != null){
            return produtoDao.uptade(id,newProduto);
        }

        return false;
    }

    private void AddID(){
        this.id++;
    }

    public List<Produto> getAllProducts(){
        return this.produtoDao.findAll();
    }

}
