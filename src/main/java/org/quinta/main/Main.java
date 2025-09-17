package org.quinta.main;

import org.quinta.adapter.TarefaRepositorioEmMemoria;
import org.quinta.casodeuso.ConcluirTarefa;
import org.quinta.casodeuso.CriarTarefa;
import org.quinta.casodeuso.ListarTarefasPendentes;
import org.quinta.entidade.Tarefa;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TarefaRepositorioEmMemoria repositorioEmMemoria = new TarefaRepositorioEmMemoria();

        CriarTarefa criar = new CriarTarefa(repositorioEmMemoria);
        ListarTarefasPendentes listarPendentes = new ListarTarefasPendentes(repositorioEmMemoria);
        ConcluirTarefa concluir = new ConcluirTarefa(repositorioEmMemoria);

        criar.executar("certificacao");
        criar.executar("Docker");

        List<Tarefa> listaTarefas =  listarPendentes.executar();
        print(listaTarefas);

        Tarefa tarefaFinalizada = listaTarefas.get(1);
        concluir.executar(tarefaFinalizada);

        listaTarefas =  listarPendentes.executar();
        print(listaTarefas);
    }

    private static void print(List<Tarefa> lista){
        for(Tarefa tarefa : lista){
            System.out.println(tarefa.getDescricao() + " está " + tarefa.getStatus() + ", ");
        }
    }

}
