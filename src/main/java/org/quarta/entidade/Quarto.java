package org.quarta.entidade;

public class Quarto {

    public enum Status {DISPONIVEL, OCUPADO }

    private int numero;
    private String tipo;
    private Status status;

    public Quarto(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.status = Status.DISPONIVEL;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatusOCUPADO() {
        if (status == Status.OCUPADO) {
            System.out.println("quarto já está reservado");
        }
        status = Status.OCUPADO;
    }
}
