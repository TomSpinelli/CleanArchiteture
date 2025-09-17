package org.sexta.casodeuso;

import org.sexta.entidade.Lanche;
import org.sexta.entidade.Pedido;

public class InserirLancheNoPedido {

    public void executar(Lanche lanche, Pedido pedido){
        if (pedido.getStatus() == Pedido.Status.FINALIZADO) {
            throw new IllegalStateException("Pedido já foi finalizado");
        }

        if (!lanche.isDisponivel()) {
            throw new IllegalArgumentException("Lanche indisponível: " + lanche.getNome());
        }

        pedido.adicionarLanche(lanche);

    }
}
