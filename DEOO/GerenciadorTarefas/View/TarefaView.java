package View;

import Controller.TarefaController;
import Model.Tarefa;

import java.util.List;
import java.util.Scanner;

public class TarefaView {

    private TarefaController controller;

    public TarefaView (){
        controller = new TarefaController(this);
    }

    public void apresentarMensagem(String msg){
        if (!msg.isEmpty()){
            System.out.println("---------------------------");
            System.out.println(msg);
            System.out.println("---------------------------");
        }
    }

    public void apresentarTarefas(List<Tarefa> tarefas){
        if (tarefas.isEmpty()){
            System.out.println("Não existem dados para exibir");
        } else {
            System.out.println(" >> TAREFAS <<");
            int i = 1;
            for (Tarefa t : tarefas){
                System.out.printf("%2d. %s\t%s\n", i,t.getDescricao(), t.isConcluida()? "CONCLUÍDA" : "PENDENTE"); i++;
            }
            System.out.println("**********************************************");
        }
    }

    public void apresentarTarefas(){
        controller.listarTarefas();
    }

    public void novaTarefa(Scanner input){
        System.out.println(">> NOVA TAREFA <<");
        System.out.println("Descrição: ");
        var descricao = input.nextLine();
        controller.adicionarTarefa(descricao);
    }

    public void concluirTarefa(Scanner input){
        controller.listarTarefas();
        System.out.println(">> SELECIONE UMA TAREFA <<");
        int posicao = input.nextInt();
        controller.concluirTarefa(posicao);
    }

}
