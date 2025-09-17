package org.primeira.casodeuso;


import org.primeira.entidade.Aluno;
import org.primeira.repositorio.AlunoRepository;

public class CadastrarAluno {
    private final AlunoRepository alunoRepository;

    public CadastrarAluno(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public void executar(String id, String nome, String email) {
        Aluno aluno = new Aluno(id, nome, email);
        alunoRepository.salvar(aluno);
    }
}
