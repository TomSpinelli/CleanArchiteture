package org.segunda.casodeuso;

import org.segunda.casodeuso.dto.FuncionarioDTO;
import org.segunda.entidade.Funcionario;
import org.segunda.repositorio.FuncionarioRepositorio;
import java.util.List;
import java.util.stream.Collectors;

public class ListarFuncionarios {

    private final FuncionarioRepositorio funcionarioRepositorio;

    public ListarFuncionarios(FuncionarioRepositorio funcionarioRepositorio) {
        this.funcionarioRepositorio = funcionarioRepositorio;
    }

    public List<FuncionarioDTO> executar() {
        List<Funcionario> funcionarios = funcionarioRepositorio.listar();

        return funcionarios.stream()
                .map(funcionario -> new FuncionarioDTO(funcionario.getNome(), funcionario.getCargo(), funcionario.getSalario()))
                .collect(Collectors.toList());
    }
}
