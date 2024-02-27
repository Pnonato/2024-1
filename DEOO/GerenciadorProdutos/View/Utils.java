package View;

import Dto.ProdutoDto;

import java.util.Scanner;

public class Utils {
    private final static Scanner scanner = new Scanner(System.in);
    private final static String line = "--------------------------------------";

    public static int readInteger(String msg){
        System.out.println(line);
        System.out.print(msg.toUpperCase());
        return scanner.nextInt();
    }
    public static ProdutoDto lerProduto(){

        System.out.println(line);
        System.out.println("NOVO PRODUTO");
        System.out.print("NOME: ");
        String nome = scanner.nextLine();
        scanner.nextLine();
        System.out.print("DESCRIÇÃO: ");
        String descricao = scanner.nextLine();
        System.out.print("PREÇO: ");
        int preco = scanner.nextInt();
        scanner.nextLine();
        System.out.print("QUANTIDADE DISPONIVEL: ");
        int qtde = scanner.nextInt();
        System.out.print("IDENTIFICADOR DO PRODUTO: ");
        int id = scanner.nextInt();

        var dto = new ProdutoDto(nome,descricao,preco,qtde,id);
        return dto;

    }

    public static void ShowProdutos(ProdutoDto produto){
        System.out.println(line);

        System.out.println("NOME: " + produto.name);

        System.out.println("DESCRIÇÃO: " + produto.description);

        System.out.println("PREÇO: " + produto.price);

        System.out.println("QUANTIDADE DISPONIVEL: " + produto.amount);

        System.out.println("IDENTIFICADOR DO PRODUTO: " + produto.identifier);

        System.out.println(line);


    }

    public int lerID(int id){
        return id;
    }
    public static void showMessage(String msg){
        System.out.println();
        System.out.println();
        System.out.println(line);
        System.out.println();
        System.out.println(msg.toUpperCase());
        System.out.println();
        System.out.println(line);
        System.out.println();
        System.out.println();
    }


}
