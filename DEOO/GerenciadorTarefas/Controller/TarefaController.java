package Controller;

import Model.Tarefa;
import View.TarefaView;

import java.util.ArrayList;
import java.util.List;

public class TarefaController {

    private List<Tarefa> tarefas;
    private TarefaView view;

    public TarefaController(TarefaView view){
        this.view = view;
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){

        var tarefa = new Tarefa(descricao);
        tarefas.add(tarefa);

        view.apresentarMensagem("Adicionado com sucesso");
    }

    public void concluirTarefa(int posicao){

        posicao--;

        if (posicao >= 0 && posicao <= tarefas.size()){
            tarefas.get(posicao).marcarComoConcluida();
            view.apresentarMensagem("Tarefa concluída com sucesso");
        } else {
            view.apresentarMensagem("Tarefa não está na lista");
        }
    }

    public void listarTarefas(){
        view.apresentarTarefas(tarefas);
    }
}
