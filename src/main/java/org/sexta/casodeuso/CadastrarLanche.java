package org.sexta.casodeuso;

import org.sexta.entidade.Lanche;
import org.sexta.repositorio.LancheRepositorio;

public class CadastrarLanche {

    private final LancheRepositorio repositorio;

    public CadastrarLanche(LancheRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void executar(String nome, double preco, boolean disponivel) {
        Lanche lanche = new Lanche(nome, preco, disponivel);
        repositorio.salvar(lanche);
    }
}
