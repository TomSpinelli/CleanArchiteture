package org.sexta.casodeuso;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sexta.adapter.LancheRepositorioEmMemoria;
import org.sexta.adapter.PedidoRepositorioEmMemoria;
import org.sexta.entidade.Lanche;
import org.sexta.entidade.Pedido;
import static org.junit.jupiter.api.Assertions.*;

class FinalizarPedidoTest {

    LancheRepositorioEmMemoria lancheRepo;
    PedidoRepositorioEmMemoria pedidoRepo;
    CadastrarLanche cadastrarLanche;
    ListarLanches listar;
    CriarPedido criarPedido;
    FinalizarPedido finalizar;
    InserirLancheNoPedido inserirLancheNoPedido;

    @BeforeEach
    void setUp() {
        lancheRepo = new LancheRepositorioEmMemoria();
        pedidoRepo = new PedidoRepositorioEmMemoria();
        cadastrarLanche = new CadastrarLanche(lancheRepo);
        listar = new ListarLanches(lancheRepo);
        criarPedido = new CriarPedido(pedidoRepo, lancheRepo);
        finalizar = new FinalizarPedido();
        inserirLancheNoPedido = new InserirLancheNoPedido();
    }

    @Test
    void DeveLancarExecaoAoFinalizarPedidoFinalizado() {

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

        RuntimeException exception = assertThrows(IllegalStateException.class, () -> {
            finalizar.executar(pedido);
        });

        assertEquals("Pedido já está finalizado", exception.getMessage());

    }
}