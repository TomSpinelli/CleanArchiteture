package org.primeira.entidade;

public class Aluno {
    private String matricula;
    private String nome;
    private String curso;

    public Aluno(String id, String nome, String curso) {
        this.matricula = id;
        this.nome = nome;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }
}
