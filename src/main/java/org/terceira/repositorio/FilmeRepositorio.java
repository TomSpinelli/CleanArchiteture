package org.terceira.repositorio;

import org.terceira.entidade.Filme;

public interface FilmeRepositorio {

    void salvar(Filme filme);

    Filme buscarPorTitulo(String titulo);

}
