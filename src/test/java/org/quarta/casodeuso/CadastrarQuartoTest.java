package org.quarta.casodeuso;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.quarta.adapter.QuartoRepositorioEmMemoria;
import org.quarta.entidade.Quarto;

import static org.junit.jupiter.api.Assertions.*;

class CadastrarQuartoTest {

    QuartoRepositorioEmMemoria repositorioEmMemoria = new QuartoRepositorioEmMemoria();
    CadastrarQuarto cadastrar = new CadastrarQuarto(repositorioEmMemoria);

    @BeforeEach
    void setUp() {
        repositorioEmMemoria = new QuartoRepositorioEmMemoria();
        cadastrar = new CadastrarQuarto(repositorioEmMemoria);
    }

    @Test
    void DeveCadastrarQuarto() {
        cadastrar.executar(1, "normal");

        Quarto quarto = repositorioEmMemoria.buscar(1);

        assertNotNull(quarto);
        assertEquals(1,quarto.getNumero());
        assertEquals("normal",quarto.getTipo());
        assertEquals(Quarto.Status.DISPONIVEL,quarto.getStatus());

    }
}