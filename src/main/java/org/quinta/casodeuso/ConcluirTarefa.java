package org.quinta.casodeuso;

import org.quinta.entidade.Tarefa;
import org.quinta.repositorio.TarefaRepositorio;

public class ConcluirTarefa {

    private final TarefaRepositorio repositorio;

    public ConcluirTarefa(TarefaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void executar(Tarefa tarefa) {
        tarefa.concluir();
    }
}
