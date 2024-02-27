package Model.Dao;

import Model.Entity.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDaoImp implements ProdutoDao{

    private  static ProdutoDaoImp instance;
    private List<Produto> produtos;

     private ProdutoDaoImp(){
        produtos = new ArrayList<>(3);
    }

    public static ProdutoDaoImp getInstance(){
        if (instance == null){

            instance = new ProdutoDaoImp();
        }

        return  instance;
    }

    private boolean findProduto(Produto produto){
         for (Produto p : produtos){
             if (p.getId() == produto.getId() || p.getNome().equals(produto.getNome())){
                 return  true;
             }
         }

         return  false;
    }

    private  int findById(int id){
         int index = 1;

         for (Produto p : produtos){
             if (p.getId() == id){
                 return  index;
             }

             index++;
         }

         return index;
    }

    @Override
    public List<Produto> findAll() {
        return produtos;
    }

    @Override
    public boolean insert(Produto produto) {

         if (!findProduto(produto)){
             this.produtos.add(produto);
             return true;
         }

         return false;
    }

    @Override
    public boolean uptade(int id, Produto newProduto) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            if (p.getId() == id) {
                produtos.set(i, newProduto);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            if (p.getId() == id) {
                produtos.remove(i);
                return true;
            }
        }
        return false;
    }
}
