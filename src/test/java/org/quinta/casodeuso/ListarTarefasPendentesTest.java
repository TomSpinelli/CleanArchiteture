package org.quinta.casodeuso;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.quinta.adapter.TarefaRepositorioEmMemoria;
import org.quinta.entidade.Tarefa;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ListarTarefasPendentesTest {

    TarefaRepositorioEmMemoria repositorioEmMemoria;
    CriarTarefa criar;
    ListarTarefasPendentes listarTarefasPendentes;
    ConcluirTarefa concluirTarefa;

    int LIST_SIZE_TOTAL =2;


    @BeforeEach
    void setUp() {
        repositorioEmMemoria = new TarefaRepositorioEmMemoria();
        criar = new CriarTarefa(repositorioEmMemoria);
        listarTarefasPendentes = new ListarTarefasPendentes(repositorioEmMemoria);
        concluirTarefa = new ConcluirTarefa(repositorioEmMemoria);
    }

    @Test
    void DeveListarTarefasPendentes() {
        criar.executar("certificacao");
        criar.executar("docker");

        List<Tarefa> listaTarefas =  listarTarefasPendentes.executar();
        assertNotNull(listaTarefas);
        assertEquals(LIST_SIZE_TOTAL,listaTarefas.size());

        Tarefa tarefaConcluida = listaTarefas.get(0);
        concluirTarefa.executar(tarefaConcluida);
        listaTarefas =  listarTarefasPendentes.executar();
        assertEquals((LIST_SIZE_TOTAL -1),listaTarefas.size());

        Tarefa tarefaPendente = listaTarefas.get(0);
        assertEquals(Tarefa.Status.CONCLUIDA,tarefaConcluida.getStatus());
        assertEquals("certificacao",tarefaConcluida.getDescricao());
        assertEquals(Tarefa.Status.PENDENTE,tarefaPendente.getStatus());
        assertEquals("docker",tarefaPendente.getDescricao());
    }
}