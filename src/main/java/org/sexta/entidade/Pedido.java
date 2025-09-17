package org.sexta.entidade;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    public enum Status { ABERTO, FINALIZADO }

    private List<Lanche> lanches = new ArrayList<>();
    private double valorTotal;
    private Status status;

    public Pedido() {
        this.status = Status.ABERTO;
        this.valorTotal = 0.0;
    }

    public void adicionarLanche(Lanche lanche) {
        lanches.add(lanche);
        valorTotal += lanche.getPreco();
    }

    public void finalizar() {
       this.status = Status.FINALIZADO;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Status getStatus() {
        return status;
    }
}
