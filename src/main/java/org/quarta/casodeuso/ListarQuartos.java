package org.quarta.casodeuso;

import org.quarta.entidade.Quarto;
import org.quarta.repositorio.QuartoRepositorio;
import java.util.List;

public class ListarQuartos {

    private final QuartoRepositorio repositorio;

    public ListarQuartos(QuartoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public List<Quarto> executar() {
        return repositorio.listar();
    }
}
