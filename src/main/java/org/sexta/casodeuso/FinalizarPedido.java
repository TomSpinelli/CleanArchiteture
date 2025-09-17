package org.sexta.casodeuso;

import org.sexta.entidade.Pedido;

public class FinalizarPedido {

    public void executar(Pedido pedido) {
        if (pedido.getStatus() == Pedido.Status.FINALIZADO) {
            throw new IllegalStateException("Pedido já está finalizado");
        }
        pedido.finalizar();
    }
}
