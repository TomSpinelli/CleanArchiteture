package org.sexta.casodeuso;

import org.sexta.entidade.Pedido;
import org.sexta.repositorio.LancheRepositorio;
import org.sexta.repositorio.PedidoRepositorio;


public class CriarPedido {

    private final PedidoRepositorio pedidoRepositorio;

    public CriarPedido(PedidoRepositorio pedidoRepositorio, LancheRepositorio lancheRepositorio) {
        this.pedidoRepositorio = pedidoRepositorio;
    }

    public Pedido executar(Pedido pedido) {
        pedidoRepositorio.salvar(pedido);
        return pedido;
    }
}
