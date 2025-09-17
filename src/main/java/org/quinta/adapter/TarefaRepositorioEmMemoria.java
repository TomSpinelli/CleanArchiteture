package org.quinta.adapter;

import org.quinta.entidade.Tarefa;
import org.quinta.repositorio.TarefaRepositorio;
import java.util.ArrayList;
import java.util.List;

public class TarefaRepositorioEmMemoria implements TarefaRepositorio {

    private final List<Tarefa> banco = new ArrayList<>();

    @Override
    public void salvar(Tarefa tarefa) {
        banco.add(tarefa);
    }

    @Override
    public List<Tarefa> listar() {
        return new ArrayList<>(banco);
    }
}
