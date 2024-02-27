package View;

import Controller.ProdutoController;
import Dto.ProdutoDto;
import jdk.jshell.execution.Util;

import java.util.Scanner;

public class Console {

    private Scanner scanner;
    private ProdutoController controller;

    public Console(){
        scanner = new Scanner(System.in);
        controller = new ProdutoController();
    }

    public void run(){
        int opcao;
        do {
            System.out.println("ESCOLHA");
            System.out.println("1. ADICIONAR PRODUTO");
            System.out.println("2. REMOVER PRODUTO");
            System.out.println("3. ATUALIZAR PRODUTO");
            System.out.println("4. LISTAR PRODUTO");
            System.out.println("5. SAIR");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    ProdutoDto produtoDto = Utils.lerProduto();
                    if(controller.addProduto(produtoDto)){
                        Utils.showMessage("Produto Adicionado com sucesso");
                    } else{
                        Utils.showMessage("Erro ao adicionar produto");
                    }
                    break;


                case 2:

                    int idToRemove = Utils.readInteger("Digite o ID do produto que deseja remover: ");
                        for(ProdutoDto p: controller.getAllProducts()){
                            if ( idToRemove == p.identifier){
                                controller.removeProduto(idToRemove);
                                Utils.showMessage("Produto removido com sucesso");
                                break;
                            } else {
                                Utils.showMessage("Identificador não encontrado");
                            }
                        }

                        break;

                case 3:

                    int idToAtt = Utils.readInteger("Digite o ID do produto que deseja atualizar: ");
                        for(ProdutoDto p : controller.getAllProducts()){
                            if(idToAtt == p.identifier){
                                ProdutoDto produtoDto1 = Utils.lerProduto();
                                controller.attProduct(idToAtt,produtoDto1);
                                Utils.showMessage("Produto atualizado com sucesso");
                            } else {
                                Utils.showMessage("Erro ao atualizar produto");
                            }
                        }

                        break;


                case 4:

                    if (controller.getAllProducts().isEmpty()){
                        Utils.showMessage("Não há produtos cadastrados.");
                    } else {
                        for (ProdutoDto p : controller.getAllProducts()) {
                            Utils.ShowProdutos(p);

                        }
                    }
                    break;


                case 5:
                    Utils.showMessage("Encerrando o programa....");
                    break;
            }
        } while (opcao != 5);
    }


}
