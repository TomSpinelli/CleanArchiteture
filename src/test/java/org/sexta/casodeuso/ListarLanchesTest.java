package org.sexta.casodeuso;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sexta.adapter.LancheRepositorioEmMemoria;
import org.sexta.entidade.Lanche;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ListarLanchesTest {

    LancheRepositorioEmMemoria repositorio;
    ListarLanches listarLanches;
    CadastrarLanche cadastrarLanche;

    @BeforeEach
    void setUp() {
        repositorio = new LancheRepositorioEmMemoria();
        listarLanches = new ListarLanches(repositorio);
        cadastrarLanche = new CadastrarLanche(repositorio);
    }

    @Test
    void DeveListarLanches() {
        cadastrarLanche.executar("coxinha", 5.0, true);
        cadastrarLanche.executar("brigadeiro", 3.0, true);
        cadastrarLanche.executar("coca zero", 5.0, false);
        List<Lanche> listaLanches = listarLanches.executar();

        assertNotNull(listaLanches);
        assertEquals(3,listaLanches.size());

        assertEquals("coxinha",listaLanches.get(0).getNome());
        assertEquals(5.0,listaLanches.get(0).getPreco());

        assertEquals("brigadeiro",listaLanches.get(1).getNome());
        assertEquals(3.0,listaLanches.get(1).getPreco());

        assertEquals("coca zero",listaLanches.get(2).getNome());
        assertEquals(5.0,listaLanches.get(2).getPreco());

    }
}