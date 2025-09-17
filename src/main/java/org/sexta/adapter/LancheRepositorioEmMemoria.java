package org.sexta.adapter;

import org.sexta.entidade.Lanche;
import org.sexta.repositorio.LancheRepositorio;
import java.util.ArrayList;
import java.util.List;

public class LancheRepositorioEmMemoria implements LancheRepositorio {

    private final List<Lanche> banco = new ArrayList<>();

    @Override
    public void salvar(Lanche lanche) {
        banco.add(lanche);
    }

    @Override
    public List<Lanche> listar() {
        return new ArrayList<>(banco);
    }

    @Override
    public Lanche buscar(String nome) {
        return banco.stream()
                .filter(lanche -> lanche.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }
}
