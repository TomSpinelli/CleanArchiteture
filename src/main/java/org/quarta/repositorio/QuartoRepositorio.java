package org.quarta.repositorio;

import org.quarta.entidade.Quarto;
import java.util.List;

public interface QuartoRepositorio {

    void salvar(Quarto quarto);

    List<Quarto> listar();

    Quarto buscar(int numero);
}
