package org.quinta.casodeuso;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.quinta.adapter.TarefaRepositorioEmMemoria;
import org.quinta.entidade.Tarefa;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CriarTarefaTest {

    TarefaRepositorioEmMemoria repositorioEmMemoria;
    CriarTarefa criar;
    ListarTarefasPendentes listarTarefasPendentes;

    @BeforeEach
    void setUp() {
        repositorioEmMemoria = new TarefaRepositorioEmMemoria();
        criar = new CriarTarefa(repositorioEmMemoria);
        listarTarefasPendentes = new ListarTarefasPendentes(repositorioEmMemoria);
    }

    @Test
    void deveCriarTarefa() {
        criar.executar("certificacao");

        List<Tarefa> listaTarefas =  listarTarefasPendentes.executar();

        Tarefa tarefa = listaTarefas.get(0);

        assertNotNull(tarefa);
        assertEquals("certificacao",tarefa.getDescricao());
        assertEquals(Tarefa.Status.PENDENTE,tarefa.getStatus());
    }
}