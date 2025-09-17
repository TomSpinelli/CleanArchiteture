package org.quinta.casodeuso;


import org.quinta.entidade.Tarefa;
import org.quinta.repositorio.TarefaRepositorio;
import java.util.List;
import java.util.stream.Collectors;

public class ListarTarefasPendentes {

    private final TarefaRepositorio repositorio;

    public ListarTarefasPendentes(TarefaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public List<Tarefa> executar() {
        return repositorio.listar().stream()
                .filter(tarefa -> tarefa.getStatus() == Tarefa.Status.PENDENTE)
                .collect(Collectors.toList());
    }
}
