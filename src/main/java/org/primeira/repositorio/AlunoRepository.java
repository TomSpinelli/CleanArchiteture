package org.primeira.repositorio;

import org.primeira.entidade.Aluno;

public interface AlunoRepository {
    void salvar(Aluno aluno);
    Aluno buscar(String id);
}
