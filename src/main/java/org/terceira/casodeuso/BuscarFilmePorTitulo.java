package org.terceira.casodeuso;

import org.terceira.entidade.Filme;
import org.terceira.repositorio.FilmeRepositorio;

public class BuscarFilmePorTitulo {
    private final FilmeRepositorio filmeRepositorio;

    public BuscarFilmePorTitulo(FilmeRepositorio filmeRepositorio) {
        this.filmeRepositorio = filmeRepositorio;
    }

    public Filme executar(String titulo) {
        Filme filme = filmeRepositorio.buscarPorTitulo(titulo);

        if (filme == null) {
            throw new RuntimeException("not found");
        }
        return filme;
    }
}
