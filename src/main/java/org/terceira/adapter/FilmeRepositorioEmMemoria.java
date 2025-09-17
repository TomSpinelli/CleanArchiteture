package org.terceira.adapter;

import org.terceira.entidade.Filme;
import org.terceira.repositorio.FilmeRepositorio;
import java.util.HashMap;
import java.util.Map;

public class FilmeRepositorioEmMemoria implements FilmeRepositorio {

    private final Map<String, Filme> banco = new HashMap<>();

    @Override
    public void salvar(Filme filme) {
        banco.put(filme.getTitulo().toLowerCase(), filme);
    }

    @Override
    public Filme buscarPorTitulo(String titulo) {
        return banco.get(titulo.toLowerCase());
    }
}
