package org.segunda.repositorio;

import org.segunda.entidade.Funcionario;
import java.util.List;

public interface FuncionarioRepositorio {

    void salvar(Funcionario funcionario);

    List<Funcionario> listar();
}
