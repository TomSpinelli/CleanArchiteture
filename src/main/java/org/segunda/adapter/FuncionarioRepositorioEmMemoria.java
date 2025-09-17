package org.segunda.adapter;

import org.segunda.entidade.Funcionario;
import org.segunda.repositorio.FuncionarioRepositorio;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepositorioEmMemoria implements FuncionarioRepositorio {

    private final List<Funcionario> banco = new ArrayList<>();

    @Override
    public void salvar(Funcionario funcionario) {
        banco.add(funcionario);
    }

    public List<Funcionario> listar() {
        return new ArrayList<>(banco);
    }
}
