package org.terceira.casodeuso;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.terceira.adapter.FilmeRepositorioEmMemoria;
import org.terceira.entidade.Filme;
import static org.junit.jupiter.api.Assertions.*;

class BuscarFilmePorTituloTest {

    BuscarFilmePorTitulo buscarFilmePorTitulo;
    FilmeRepositorioEmMemoria repositorioEmMemoria;

    @BeforeEach
    void setUp() {
        repositorioEmMemoria = new FilmeRepositorioEmMemoria();
        buscarFilmePorTitulo = new BuscarFilmePorTitulo(repositorioEmMemoria);
    }

    @Test
    void DeveLancarExcecao() {

        repositorioEmMemoria.salvar(new Filme("LOTR", "Ficção Científica", 2000));
        buscarFilmePorTitulo = new BuscarFilmePorTitulo(repositorioEmMemoria);

        Filme filme = buscarFilmePorTitulo.executar("LOTR");
        assertNotNull(filme);

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            buscarFilmePorTitulo.executar("Harry Potter");
        });

        assertEquals("not found", exception.getMessage());

    }
}