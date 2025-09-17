package org.quarta.casodeuso;

import org.quarta.entidade.Quarto;
import org.quarta.repositorio.QuartoRepositorio;

public class CadastrarQuarto {

    private final QuartoRepositorio repositorio;

    public CadastrarQuarto(QuartoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void executar(int numero, String tipo) {
        Quarto quarto = new Quarto(numero, tipo);
        repositorio.salvar(quarto);
    }
}
