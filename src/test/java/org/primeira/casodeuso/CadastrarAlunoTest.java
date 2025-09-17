package org.primeira.casodeuso;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.primeira.adapter.AlunoRepositoryEmMemoria;
import org.primeira.entidade.Aluno;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CadastrarAlunoTest {

    CadastrarAluno cadastrarAluno;
    AlunoRepositoryEmMemoria repositorioEmMemoria;

        @BeforeEach
    void setup() {
        repositorioEmMemoria = new AlunoRepositoryEmMemoria();
        cadastrarAluno = new CadastrarAluno(repositorioEmMemoria);
    }

    @Test
    void DeveCadastrarOAluno() {
        cadastrarAluno.executar("265", "Tomas", "Ciencias da Comp");

        Aluno aluno = repositorioEmMemoria.buscar("265");

        assertNotNull(aluno);
        assertEquals("265", aluno.getMatricula());
        assertEquals("Tomas", aluno.getNome());
        assertEquals("Ciencias da Comp", aluno.getCurso());

    }
}