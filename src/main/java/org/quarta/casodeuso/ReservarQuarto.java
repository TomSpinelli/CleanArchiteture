package org.quarta.casodeuso;

import org.quarta.entidade.Quarto;
import org.quarta.repositorio.QuartoRepositorio;

public class ReservarQuarto {

    private final QuartoRepositorio repositorio;

    public ReservarQuarto(QuartoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void executar(int numero) {
        Quarto quarto = repositorio.buscar(numero);
        quarto.setStatusOCUPADO();
    }
}
