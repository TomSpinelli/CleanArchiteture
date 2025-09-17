package org.sexta.casodeuso;

import org.sexta.entidade.Lanche;
import org.sexta.repositorio.LancheRepositorio;
import java.util.List;

public class ListarLanches {

    private final LancheRepositorio repositorio;

    public ListarLanches(LancheRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public List<Lanche> executar() {
        return repositorio.listar();
    }
}
