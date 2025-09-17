package org.segunda.casodeuso;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.segunda.adapter.FuncionarioRepositorioEmMemoria;
import org.segunda.casodeuso.dto.FuncionarioDTO;
import org.segunda.entidade.Funcionario;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ListarFuncionariosTest {

    ListarFuncionarios listarFuncionarios;
    FuncionarioRepositorioEmMemoria funcionarioRepositorioEmMemoria;

    @BeforeEach
    void setup() {
        funcionarioRepositorioEmMemoria = new FuncionarioRepositorioEmMemoria();
        listarFuncionarios = new ListarFuncionarios(funcionarioRepositorioEmMemoria);
    }


    @Test
    void DeveListarFuncionarios() {

        funcionarioRepositorioEmMemoria.salvar(new Funcionario("tomas", "desenvolvedor", 8000));
        funcionarioRepositorioEmMemoria.salvar(new Funcionario("Rannyer", "professor", 25000));
        funcionarioRepositorioEmMemoria.salvar(new Funcionario("marcio", "gerente", 20000));

        List<FuncionarioDTO> lista = listarFuncionarios.executar();

        assertNotNull(lista);
        assertEquals(3, lista.size());

        assertEquals("tomas", lista.get(0).getNome());
        assertEquals("desenvolvedor", lista.get(0).getCargo());
        assertEquals(8000, lista.get(0).getSalario());

        assertEquals("Rannyer", lista.get(1).getNome());
        assertEquals("professor", lista.get(1).getCargo());
        assertEquals(25000, lista.get(1).getSalario());

        assertEquals("marcio", lista.get(2).getNome());
        assertEquals("gerente", lista.get(2).getCargo());
        assertEquals(20000, lista.get(2).getSalario());

    }
}