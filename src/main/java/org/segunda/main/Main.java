package org.segunda.main;

import org.segunda.adapter.FuncionarioRepositorioEmMemoria;
import org.segunda.casodeuso.ListarFuncionarios;
import org.segunda.casodeuso.dto.FuncionarioDTO;
import org.segunda.entidade.Funcionario;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FuncionarioRepositorioEmMemoria repositorioEmMemoria = new FuncionarioRepositorioEmMemoria();

        repositorioEmMemoria.salvar(new Funcionario("tomas", "desenvolvedor", 8000));
        repositorioEmMemoria.salvar(new Funcionario("Rannyer", "professor", 25000));
        repositorioEmMemoria.salvar(new Funcionario("marcio", "gerente", 20000));

        ListarFuncionarios listaFuncionarios = new ListarFuncionarios(repositorioEmMemoria);
        List<FuncionarioDTO> lista = listaFuncionarios.executar();

        for(FuncionarioDTO funcionario : lista ){
            System.out.println(funcionario.getNome() + ", do cargo: " + funcionario.getCargo() + " recebe: " + funcionario.getSalario());
        }

    }
}
