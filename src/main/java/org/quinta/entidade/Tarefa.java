package org.quinta.entidade;

public class Tarefa {

    public enum Status { PENDENTE, CONCLUIDA }

    private String descricao;
    private Status status;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.status = Status.PENDENTE;
    }

    public String getDescricao() {
        return descricao;
    }

    public Status getStatus() {
        return status;
    }

    public void concluir() {
        if (status == Status.CONCLUIDA) {
            System.out.println("Tarefa já foi concluida");
        }
        status = Status.CONCLUIDA;
    }
}
