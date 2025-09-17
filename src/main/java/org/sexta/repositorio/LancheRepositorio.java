package org.sexta.repositorio;

import org.sexta.entidade.Lanche;
import java.util.List;

public interface LancheRepositorio {

    void salvar(Lanche lanche);

    List<Lanche> listar();

    Lanche buscar(String nome);
}
