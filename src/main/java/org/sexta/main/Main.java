package org.sexta.main;

import org.sexta.adapter.LancheRepositorioEmMemoria;
import org.sexta.adapter.PedidoRepositorioEmMemoria;
import org.sexta.casodeuso.*;
import org.sexta.entidade.Lanche;
import org.sexta.entidade.Pedido;


public class Main {

    public static void main(String[] args) {

        LancheRepositorioEmMemoria lancheRepo = new LancheRepositorioEmMemoria();
        PedidoRepositorioEmMemoria pedidoRepo = new PedidoRepositorioEmMemoria();

        CadastrarLanche cadastrarLanche = new CadastrarLanche(lancheRepo);
        CriarPedido criarPedido = new CriarPedido(pedidoRepo, lancheRepo);
        FinalizarPedido finalizar = new FinalizarPedido();
        InserirLancheNoPedido inserirLancheNoPedido = new InserirLancheNoPedido();

        cadastrarLanche.executar("coxinha", 5.0, true);
        cadastrarLanche.executar("brigadeiro", 3.0, true);
        cadastrarLanche.executar("coca zero", 5.0, false);

        Lanche coxinha = lancheRepo.buscar("coxinha");
        Lanche brigadeiro = lancheRepo.buscar("brigadeiro");

        Pedido pedido = new Pedido();
        inserirLancheNoPedido.executar(coxinha,pedido);
        inserirLancheNoPedido.executar(brigadeiro,pedido);
        criarPedido.executar(pedido);

        finalizar.executar(pedido);
        System.out.println("Pedido " + pedido.getStatus() + " totalizando R$: " + pedido.getValorTotal());
    }
}
