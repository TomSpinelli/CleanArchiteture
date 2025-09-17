package org.primeira.main;

import org.primeira.adapter.AlunoRepositoryEmMemoria;
import org.primeira.casodeuso.CadastrarAluno;
import org.primeira.entidade.Aluno;

public class Main {

    public static void main(String[] args) {

        AlunoRepositoryEmMemoria repositorioEmMemoria = new AlunoRepositoryEmMemoria();
        CadastrarAluno cadastrarAluno = new CadastrarAluno(repositorioEmMemoria);

        cadastrarAluno.executar("265", "Tomas", "tomas@gmail.com");

        Aluno aluno = repositorioEmMemoria.buscar("265");

        System.out.println(aluno.getNome() + " - " + aluno.getCurso());
    }
}
