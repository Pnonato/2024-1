package View;

import java.util.Scanner;

public class Console {

    // Uma forma de tratar de forma distinda a View GERAL da view de TAREFAS, para isso Console possui um atributo depenencia de uma TarefaView.

    private Scanner scanner;
    private  TarefaView tarefaView;

    public Console(){
        scanner = new Scanner(System.in);
        tarefaView = new TarefaView();
    }

// RUN cuidara do menu de opções e e chamadas para a TarefaView
    public void  run(){

        int opcao;

        do {
            System.out.println("ESCOLHA");
            System.out.println("1. NOVA TAREFA");
            System.out.println("2. LISTAR TAREFAS");
            System.out.println("3. CONCLUIR TAREFA");
            System.out.println("4. SAIR");

            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    tarefaView.novaTarefa(scanner);
                    break;

                case 2:
                    tarefaView.apresentarTarefas();
                    break;

                case 3:
                    tarefaView.concluirTarefa(scanner);
                    break;

            }
        } while (opcao != 4);
    }
}
