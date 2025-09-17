package org.primeira.adapter;

import org.primeira.entidade.Aluno;
import org.primeira.repositorio.AlunoRepository;
import java.util.HashMap;
import java.util.Map;

public class AlunoRepositoryEmMemoria implements AlunoRepository {
    private Map<String, Aluno> banco = new HashMap<>();

    @Override
    public Aluno buscar(String id) {
        return banco.get(id);
    }

    @Override
    public void salvar(Aluno aluno) {
        banco.put(aluno.getMatricula(), aluno);
        System.out.println("INCLUSÃO FINALIZADA: " + aluno.getNome());
    }

}
