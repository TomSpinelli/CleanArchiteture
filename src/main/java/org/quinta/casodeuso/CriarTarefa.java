package org.quinta.casodeuso;

import org.quinta.entidade.Tarefa;
import org.quinta.repositorio.TarefaRepositorio;

public class CriarTarefa {

    private final TarefaRepositorio repositorio;

    public CriarTarefa(TarefaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void executar(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        repositorio.salvar(tarefa);
    }
}
