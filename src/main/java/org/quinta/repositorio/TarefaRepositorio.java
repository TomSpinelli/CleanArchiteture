package org.quinta.repositorio;

import org.quinta.entidade.Tarefa;
import java.util.List;

public interface TarefaRepositorio {

    void salvar(Tarefa tarefa);

    List<Tarefa> listar();

}
